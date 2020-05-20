package com.winter.jsql.sqlparser;

import com.winter.jsql.enums.StatusEnum;
import com.winter.jsql.util.PrintUtil;

/**
 * @author Winter
 * @Project jsql
 * @Package com.winter.jsql.sqlparser
 * @Title SqlProcessor.java
 * @Email yanwt@vastdata.com.cn
 * @modified
 * @date 2020年05月19 23:17:51
 * @Description 此处添加该类的详细说明
 */
public class SqlProcessor {

    public void executeStatement(Statement statement){
        if(statement.getStatementEnum()==null){

        }
        switch (statement.getStatementEnum()){
            case INSERT:
                System.out.println("This is where we would do an insert.\n");
                break;
            case SELECT:
                System.out.println("This is where we would do an select.\n");
                break;
        }
    }
}
