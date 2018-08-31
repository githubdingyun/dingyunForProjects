package com.house.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * @author DinGYun
 * Filter 过滤器能过滤静态和动态资源,即response和request
 * intercept 拦截器能拦截非法请求,主要是拦截去访问的requestmapping,一般拦截位未登陆用户
 * Listener 监听器是系统初始化功能,
 */
public class CodeFilter implements Filter {

    /**
     * 容器启动之后，创建过滤器实例，然后调用这个init方法，只会调用一次，容器会将已经创建好的filterconfig对象
     * * 作为参数对象传入，可任意从参数中获取初始值
     *
     * @param filterConfig
     * @throws ServletException
     */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Enumeration<String> initParameterNames = filterConfig.getInitParameterNames();
        while (initParameterNames.hasMoreElements()) {
            String s = initParameterNames.nextElement();
            System.out.println("Filter初始化参数包括--->" + s);
        }
//        String word = filterConfig.getInitParameter("word");
//        System.out.println("Filter已初始化参数--->" + word);
    }

    /**
     * 用于请求的主要方法,对一些请求进行一些过滤
     *
     * @param servletRequest
     * @param servletResponse
     * @param filterChain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        String comments = req.getParameter("comments");
        PrintWriter writer = resp.getWriter();
        //又敏感词汇则过滤一下,显示敏感词汇警告           否则交给其他过滤器或者servlet
//        if (comments.matches("nima")) {
//            writer.println("有敏感词汇");
//        } else {
//            String requestURI = req.getRequestURI();
//            req.getRequestDispatcher(requestURI).forward(req, resp);
//        }
    }

    /**
     * 容器删除过滤器实例之前调用,只调用一次
     */
    @Override
    public void destroy() {

    }
}
