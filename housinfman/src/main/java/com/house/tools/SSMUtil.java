package com.house.tools;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author DinGYun
 * 使用反射实现  类似SSM的自动得到前端传入的对象并自动转载到  方法参数对象中
 * 注意这里传入的参数仅仅是为了得到一个类对象,并无其它更多的含义
 * <p>
 * <p>
 * 另外:反射中对方法的反射一般是为了动态代理
 */
public class SSMUtil {

    /**
     * 使用反射   实现对象自动转载
     *
     * @param req
     * @param o
     */
    public static void getParameters(HttpServletRequest req, Object o) {
        Field[] declaredFields = o.getClass().getDeclaredFields();
        for (Field field : declaredFields
                ) {
            String parameter = req.getParameter(field.getName());
            try {
                //对此对象进行操作
                field.set(o, parameter);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 使用反射完成方法名字和mapping的匹配，不同地址执行不同方法
     * 模仿框架中的requestMapping
     */
    public static <E> void requestMapping(Class<E> class1, HttpServletRequest req, HttpServletResponse resp) {
        try {
            E OE = class1.newInstance();
            String requestURI = req.getRequestURI();
            String endurl = UrlStitching.endurl(requestURI);
            System.out.println("正在解析类:" + class1.getSimpleName());
            Method[] declaredMethods = class1.getDeclaredMethods();
            for (Method method : declaredMethods
                    ) {
                System.out.println("正在匹配方法名放到方法中:           " + method.getName());
//                注意这里如果执行反射方法service时,因为反射会再执行service方法,会陷入死循环,服务器爆炸,
//                所以注意了!!!!我们的方法输入url地址不能叫做service,如果叫做service,那么系统会崩溃
//                所以对url进行处理,避免service
                if (method.getName().equals(endurl) && !"service".equals(endurl)) {
                    System.out.println(endurl);
                    try {
                        method.setAccessible(true);
                        method.invoke(OE, req, resp);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }

            }
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

    }


    /**
     * 我们知道框架中有一个responseBody模块,其实他就是resp.getwrite().println(str)而已
     * 一般requestBody来配合ajax使用
     * 我们对这个来做一个封装,直接传入字符串会返回一个html界面  或者一个string界面
     */
    public static void responseBody(String string, HttpServletRequest req, HttpServletResponse resp) {
        try {
//            保证正确读取post提交来的中文
            req.setCharacterEncoding("utf-8");
            //输出的resp为中文
            resp.setContentType("text/html;charset=utf-8");
            PrintWriter respWriter = resp.getWriter();
            respWriter.println(string);
            respWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
