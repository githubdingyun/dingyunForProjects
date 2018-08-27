package com.house.servlet;

import com.house.tools.SSMUtil;
import com.house.tools.UrlStitching;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;

/**
 * 在学习了MyBatis框架的动态代理之后,发现spring mvc项目也适合动态代理
 * 但是并没有必要,因为都是自己写的controller
 *
 * spring mvc实际上是封装了一个MODEL  一个View  和一个modelandview
 * 我们为了简便,并没有封装
 * 并且没有去实现它的可配置性     (注解方式注入value      )
 * ----------------------------------------------------------------   2018.8.27  后续会补上注解-------------------------------
 */
public class ServletRect extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SSMUtil.requestMapping(getClass(), req, resp);
        super.service(req, resp);
    }


    public void add(HttpServletRequest req, HttpServletResponse resp) throws IOException {

       SSMUtil.responseBody("ssss----------------------------------------------------------------",req, resp);
    }

    private void delete(HttpServletRequest req, HttpServletResponse resp) throws IOException {


    }

    private void update(HttpServletRequest req, HttpServletResponse resp) throws IOException {


    }

    private void queryAll(HttpServletRequest req, HttpServletResponse resp) throws IOException {


    }



}
