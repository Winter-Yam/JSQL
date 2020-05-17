package com.winter.jsql.repl;

import java.util.Scanner;

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
        printVersion();
        Scanner input=new Scanner(System.in);
        while (true) {
            printPrompt();
            String line = input.nextLine();
            if(".exit".equals(line)){
                System.exit(0);
            }else{
                System.out.println("unknown command");
            }
        }
    }

    private static void printPrompt() {
        System.out.print("jsql > ");
    }

    private static void printVersion(){
        System.out.println("JSQL version 0.0.1");
        System.out.println("Enter .help for usage hints .");
    }
}
