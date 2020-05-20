package com.winter.jsql.enums;

/**
 * 告警级别Enum
 * @author Winter
 * @Project atlasem
 * @Package cn.com.atlasdata.constant
 * @Title ConstraintTypeEnum.java
 * @Email yanwt@vastdata.com.cn
 * @modified
 * @date 2020年04月10 16:41:58
 * @Description 此处添加该类的详细说明
 */
public enum StatementEnum {

    INSERT("insert"),
    SELECT("select"),
    UNKNOWN("unknown"),
    ;

    private String statement;

    StatementEnum(String statement) {
        this.statement = statement;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public static StatementEnum getStatement(String statement) {
        for (StatementEnum statementEnum : values()) {
            if (statementEnum.getStatement().equals(statement)) {
                return statementEnum;
            }
        }
        return null;
    }
}
