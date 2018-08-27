package com.house.tools;

/**
 * @author DinGYun
 */
public class UrlStitching {
    /**
     * 切割*.do类型的字符串得到*
     *
     * @param string
     * @return
     */
    public static String perurl(String string) {
        return string.substring(string.lastIndexOf('/') + 1, string.lastIndexOf('.'));
    }

    /**
     * 切割xxx.*类型的字符串得到*
     *
     * @param string
     * @return
     */
    public static String endurl(String string) {
        return string.substring(string.lastIndexOf('/') + 1, string.length());
    }

    /**
     * 拼接字符串实现类似框架中的   视图定位器
     *
     * @param string
     * @return
     */
    public static String jspurl(String string) {
        return "/WEB-INF/pages/" + string + ".jsp";
    }

    /**
     * 数据工具类的字符转换方法
     * @param str
     * @return
     */
    public static String columnTransform(String str) {
        String s1 = str.substring(0, str.lastIndexOf('_'));
        String s2 = str.substring(str.lastIndexOf('_')+1);
        String s3 = s2.substring(0, 1).toUpperCase() + s2.substring(1);
        return s1+s3;
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(perurl("222/sss.doaa"));
        System.out.println(endurl("sdsd/adsa/sssass"));
        System.out.println(jspurl("sadsa"));
        System.out.println(columnTransform("u_aaa"));
    }
}
