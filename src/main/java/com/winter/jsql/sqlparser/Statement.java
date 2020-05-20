package com.winter.jsql.sqlparser;

import com.winter.jsql.enums.StatementEnum;

/**
 * @author Winter
 * @Project jsql
 * @Package com.winter.jsql.sqlparser
 * @Title Statement.java
 * @Email yanwt@vastdata.com.cn
 * @modified
 * @date 2020年05月19 23:23:07
 * @Description 此处添加该类的详细说明
 */
public class Statement {

    private String sql;
    private StatementEnum statementEnum;

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public StatementEnum getStatementEnum() {
        return statementEnum;
    }

    public void setStatementEnum(StatementEnum statementEnum) {
        this.statementEnum = statementEnum;
    }
}
