package com.winter.jsql.sqlparser;

import com.winter.jsql.enums.StatementEnum;
import com.winter.jsql.enums.StatusEnum;

/**
 * @author Winter
 * @Project jsql
 * @Package com.winter.jsql.sqlparser
 * @Title SqlComplier.java
 * @Email yanwt@vastdata.com.cn
 * @modified
 * @date 2020年05月19 23:14:15
 * @Description 此处添加该类的详细说明
 */
public class SqlComplier {

    public StatusEnum prepareStatement(String token, Statement statement){
        if(token.equals("select")){
            statement.setStatementEnum(StatementEnum.SELECT);
            return StatusEnum.SUCCESS;
        }else if(token.equals("insert")){
            statement.setStatementEnum(StatementEnum.INSERT);
            return StatusEnum.SUCCESS;
        }else{
            statement.setStatementEnum(StatementEnum.UNKNOWN);
            return StatusEnum.UNKNOWN;
        }
    }
}
