package com.winter.jsql.util;

/**
 * @author Winter
 * @Project jsql
 * @Package com.winter.jsql.util
 * @Title PrintUtil.java
 * @Email yanwt@vastdata.com.cn
 * @modified
 * @date 2020年05月19 23:26:38
 * @Description 此处添加该类的详细说明
 */
public class PrintUtil {

    public static void printPrompt() {
        System.out.print("jsql > ");
    }

    public static void printPrompt(String msg) {
        System.out.print("jsql > "+msg);
    }

    public static void printVersion(){
        System.out.println("JSQL version 0.0.1");
        System.out.println("Enter .help for usage hints .");
    }
}
