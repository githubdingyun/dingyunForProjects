package com.house.tools;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Date;

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
     * 使用反射   实现对象自动从前端装载
     *
     * @param req
     * @param o
     */
    public static void getParameters(HttpServletRequest req, Object o) {
        System.out.println("----------------------------------------------------------------");
        System.out.println("--------------------------正在获取前端属性自动装载到对象--------------------------------------");
        System.out.println("----------------------------------------------------------------");
        Field[] declaredFields = o.getClass().getDeclaredFields();
        for (Field field : declaredFields
                ) {
            String fieldName = field.getName();
            System.out.print("正在获取属性" + "--------" + fieldName + "----------" + "到后端:\n");
            String parameter = req.getParameter(fieldName);
            Class<?> type = field.getType();
            String simpleName = type.getSimpleName();
            field.setAccessible(true);
            if (parameter != null && !parameter.equals("")) {
                System.out.printf("属性名为: %s, ----> 属性类型为%s ---->转入属性value:  %s\n", fieldName, simpleName, parameter);
                try {
                    if ("String".equals(simpleName)) {
                        field.set(o, parameter);
                    } else if ("Integer".equals(simpleName)) {
                        Integer i = Integer.parseInt(parameter);
                        field.set(o, i);
                    } else if ("Double".equals(simpleName)) {
                        Double parseDouble = Double.parseDouble(parameter);
                        field.set(o, parseDouble);
                    } else if ("Date".equals(simpleName)) {
                        Date date = Date.valueOf(parameter);
                        field.set(o, date);
                    } else {
                        System.out.println("---------------------------当前类型未考虑!!!!!-------------------------------------");
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }

            } else {
                System.out.println("该属性为空,不装载");
            }
            System.out.println("----------------------------------------------------------------");
            System.out.println("----------------------------------------------------------------");
        }
        System.out.println("----------------------------------------------------------------");
        System.out.println("--------------------------装载结束--------------------------------------");
        System.out.println("----------------------------------------------------------------");
    }


    /**
     * 使用反射完成方法名字和mapping的匹配，不同地址执行不同方法
     * 模仿框架中的requestMapping
     */
    public static <E> void serviceMapping(Class<E> class1, HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("----------------------------------------------------------------");
        System.out.println("--------------------------正在对方法解析映射到request mapping (url)--------------------------------------");
        System.out.println("----------------------------------------------------------------");
        try {
            E OE = class1.newInstance();
            String requestURI = req.getRequestURI();
            String endurl = UrlStitching.endurl(requestURI);
            String simpleName = class1.getSimpleName();
            System.out.println("正在解析类:" + simpleName);
            Method[] declaredMethods = class1.getDeclaredMethods();
            for (Method method : declaredMethods
                    ) {
                System.out.println("正在匹配方法名     ---->>       " + method.getName());
//                注意这里如果执行反射方法service时,因为反射会再执行service方法,会陷入死循环,服务器爆炸,
//                所以注意了!!!!我们的方法输入url地址不能叫做service,如果叫做service,那么系统会崩溃
//                所以对url进行处理,避免service
                if (method.getName().equals(endurl) && !"service".equals(endurl)) {
                    System.out.println("已经成功匹配方法   ---->>           " + endurl);
                    try {
                        method.setAccessible(true);
                        method.invoke(OE, req, resp);
                        break;
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }

            }
            System.out.println("----------------------------------------------------------------");
            System.out.println("--------------------------映射结束!!!--------------------------------------");
            System.out.printf("              当前操作的servlet--->>   %s   当前url---->>   %s                \n\n\n", simpleName, requestURI);
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
            respWriter.print(string);
            respWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //    转发
    public static void requestMapping(String string, HttpServletRequest req, HttpServletResponse resp) {
        try {
            req.setCharacterEncoding("utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        try {
            if (string.matches("html")) {
                req.getRequestDispatcher("WEB-INF/pages" + string).forward(req, resp);

            } else {
                String jspurl = UrlStitching.jspurl(string);
                System.out.println("正在跳转到页面    :    " + jspurl);

                req.getRequestDispatcher(jspurl).forward(req, resp);
            }

        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

}
