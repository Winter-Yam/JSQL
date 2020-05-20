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
public enum StatusEnum {

    SUCCESS("success"),
    UNKNOWN("unknown"),
    PREPARE_SYNTAX_ERROR("prepare syntax error"),
    ;

    private String status;

    StatusEnum(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static StatusEnum getByStatus(String status) {
        for (StatusEnum statusEnum : values()) {
            if (statusEnum.getStatus().equals(status)) {
                return statusEnum;
            }
        }
        return null;
    }
}
