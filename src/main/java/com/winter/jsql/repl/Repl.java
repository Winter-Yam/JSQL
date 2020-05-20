package com.winter.jsql.repl;

import com.winter.jsql.sqlparser.SqlComplier;
import com.winter.jsql.sqlparser.SqlProcessor;
import com.winter.jsql.sqlparser.Statement;
import com.winter.jsql.util.PrintUtil;

import java.util.Scanner;

import static com.winter.jsql.util.PrintUtil.printPrompt;
import static com.winter.jsql.util.PrintUtil.printVersion;

/**
 * 交互式解释器
 * @author Winter
 * @Project jsql
 * @Package com.winter.jsql.repl
 * @Title Repl.java
 * @Email yanwt@vastdata.com.cn
 * @modified
 * @date 2020年05月17 16:02:55
 * @Description 此处添加该类的详细说明
 */
public class Repl {

    public static void main(String[] args) {
        PrintUtil.printVersion();
        Scanner input=new Scanner(System.in);
        while (true) {
            PrintUtil.printPrompt();
            String line = input.nextLine();
            if(".exit".equals(line)){
                System.exit(0);
            }

            if(line.startsWith(".")){
                System.out.println("success!\n");
            }else {
                String[] tokens = line.split(" ");
                String token = tokens[0];

                Statement statement = new Statement();
                SqlComplier sqlComplier = new SqlComplier();
                switch (sqlComplier.prepareStatement(token, statement)) {
                    case SUCCESS:
                        break;
                    case UNKNOWN:
                        System.out.println("Unrecognized keyword at start of "+token+"\n");
                        continue;
                }

                SqlProcessor sqlProcessor = new SqlProcessor();
                sqlProcessor.executeStatement(statement);
                System.out.println("Executed.\n");
            }

        }
    }
}
