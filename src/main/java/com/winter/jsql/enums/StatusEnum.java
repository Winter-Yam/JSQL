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
 * @Copyright 广州云图数据技术有限公司
 * @Description 此处添加该类的详细说明
 */
public enum TokenEnum {

    CRITICAL("critical"),
    WARNING("warning"),
    PROMPT("prompt"),
    ;

    private String levelName;

    TokenEnum(String levelName) {
        this.levelName = levelName;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public static AlertLevelEnum getByType(String levelName) {
        for (AlertLevelEnum levelEnum : values()) {
            if (levelEnum.getLevelName().equals(levelName)) {
                return levelEnum;
            }
        }
        return null;
    }
    public static boolean isValidLevel(String levelName) {
        for (AlertLevelEnum levelEnum : AlertLevelEnum.values()) {
            if (levelEnum.getLevelName().equals(levelName)) {
                return true;
            }
        }
        return false;
    }
}
