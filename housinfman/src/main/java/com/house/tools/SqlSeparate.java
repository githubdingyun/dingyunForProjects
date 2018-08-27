package com.house.tools;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author DinGYun
 */
public class SqlSeparate {
    /**
     * 在mybatis中是通过xml形式,我们这儿离也可以采用,
     * 但是要实现的功能简单,就使用配置信息形式来实现
     *
     * @param args
     */
    public static void main(String[] args) {

    }


    /**
     * 动态代理实现对所有的dao实现sql自动注入和
     * 动态代理得到daoimpl
     *
     * @param eClass
     * @param <E>
     */
    public static <E> void dynamicProxy(Class<E> eClass) {

        Method[] declaredMethods = eClass.getDeclaredMethods();
        //获取对应该dao的配置信息名
        String eClassName = eClass.getName();
        String classPro = eClassName.substring(0, eClassName.lastIndexOf('D'));
        classPro = classPro + ".properties";
        //获取配置信息内容
        Properties properties = new Properties();
        InputStream resourceAsStream = SqlSeparate.class.getClassLoader().getResourceAsStream(classPro);
        try {
            properties.load(resourceAsStream);
            for (Method method : declaredMethods
                    ) {
                //得到方法名并得到对应的配置信息的sql字符串
                String name = method.getName();
                properties.getProperty("name");
//这里思路突然断了,发现这样是更上层的分离,需要动态代理生成新类!!!,,这里想写一个不需要动态代理的
                String aaa = properties.getProperty(name);
                if (aaa == null) {
                    System.out.println("不存在该属性,请你检查你的mapper下的配置信息");
                }
                System.out.println(aaa);
            }

        } catch (IOException e) {
            System.out.println("找不到该文件");
            e.printStackTrace();
        }


    }

    /**
     * 得到当前方法对应的sql
     * @param eClass
     * @param <E>
     * @return
     */
    public static <E> String getSql(Class<E> eClass) {

        //获取对应该dao的配置信息名
        String eClassName = eClass.getSimpleName();
        System.out.println(eClassName);
        String classPro = eClassName.substring(0, eClassName.lastIndexOf('D'));
        classPro = classPro + ".properties";
        System.out.println(classPro);
        //获取配置信息内容
        Properties properties = new Properties();
        InputStream resourceAsStream = SqlSeparate.class.getClassLoader().getResourceAsStream(classPro);
        //       得到当前方法名
        //具体使用数组的那个元素和JVM的实现有关，我在SUN JDK6下面测试的是第二个元素，具体说明可以查看Thread.getStackTrace方法的javadoc,
        //0就是当前的类的方法名字
        //1是调用者方法名
        //2是调用方法的方法名
        //依次向上递归
        String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
        System.out.println(methodName);
        try {
            properties.load(resourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String sql = properties.getProperty(methodName);
        //注意不能使用当前方法调用反射,否则死循环,所以到此返回sql,结束
        System.out.println(sql);
        return sql;
    }
}