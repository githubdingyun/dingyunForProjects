package com.house.listener;

import com.house.tools.LessJsp;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.*;

/**
 * 监听了session的创建动作,修改存储在线人数的计数器
 * 这是监听器,对整个容器监听,可以在这写初始化工作,比如实现一个总点击次数
 * 这个值保存在servlet上下文中
 */
@WebListener()
public class SystemInitListener implements ServletContextListener,
        HttpSessionListener, HttpSessionAttributeListener {

    // Public constructor is required by servlet spec
    public SystemInitListener() {
    }

    // -------------------------------------------------------
    // ServletContextListener implementation    count初始化
    // -------------------------------------------------------
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext appContext = sce.getServletContext();
        LessJsp.getel(appContext);
        Object views = appContext.getAttribute("views");
        if (views == null) {
            views = appContext.getInitParameter("views");
        } else {
            Integer i = Integer.parseInt((String) views);
            i = i + 1;
            String s = String.valueOf(i);
            appContext.setAttribute("views", views);
        }
        appContext.setAttribute("sysInit", "系统初始化准备成功");
    }

    public void contextDestroyed(ServletContextEvent sce) {
      /* This method is invoked when the Servlet Context 
         (the Web application) is undeployed or 
         Application Server shuts down.
      */
    }

    // -------------------------------------------------------
    // HttpSessionListener implementation    每创建一个session我们count++
    // -------------------------------------------------------
    public void sessionCreated(HttpSessionEvent se) {
        /* Session is created. */
        HttpSession session = se.getSession();
        ServletContext servletContext = session.getServletContext();
        String count = (String) servletContext.getAttribute("views");
        servletContext.setAttribute("views", String.valueOf(Integer.parseInt(count)+1));

    }

    public void sessionDestroyed(HttpSessionEvent se) {
        /* Session is destroyed. */
        HttpSession session = se.getSession();
        ServletContext servletContext = session.getServletContext();
        String count = (String) servletContext.getAttribute("views");
        servletContext.setAttribute("views", String.valueOf(Integer.parseInt(count)-1));

    }

    // -------------------------------------------------------
    // HttpSessionAttributeListener implementation      每销毁一个session我们count--
    // -------------------------------------------------------

    public void attributeAdded(HttpSessionBindingEvent sbe) {
      /* This method is called when an attribute 
         is added to a session.
      */
    }

    public void attributeRemoved(HttpSessionBindingEvent sbe) {
      /* This method is called when an attribute
         is removed from a session.
      */
    }

    public void attributeReplaced(HttpSessionBindingEvent sbe) {
      /* This method is invoked when an attibute
         is replaced in a session.
      */
    }
}
