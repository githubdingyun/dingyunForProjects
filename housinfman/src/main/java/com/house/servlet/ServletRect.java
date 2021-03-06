package com.house.servlet;


import com.house.dao.impl.RectDAOImpl;
import com.house.pojo.Rect;
import com.house.tools.SSMUtil;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * 在学习了MyBatis框架的动态代理之后,发现spring mvc项目也适合动态代理
 * 但是并没有必要,因为都是自己写的controller
 * <p>
 * spring mvc实际上是封装了一个MODEL  一个View  和一个modelandview
 * 我们为了简便,并没有封装
 * 并且没有去实现它的可配置性     (注解方式注入value      )
 * ----------------------------------------------------------------   2018.8.27  后续会补上注解-------------------------------
 */
public class ServletRect extends HttpServlet {

    private Rect rect = new Rect();
    private RectDAOImpl rectDAO = new RectDAOImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SSMUtil.serviceMapping(getClass(), req, resp);
    }

    private void add(HttpServletRequest request, HttpServletResponse resp) {
        SSMUtil.getParameters(request, rect);
        int i = rectDAO.insert(rect);
        SSMUtil.responseBody(i == 1 ? "success" : "fail", request, resp);
    }

    private void delete(HttpServletRequest request, HttpServletResponse resp) {
        SSMUtil.getParameters(request, rect);
        System.out.println(rect);
        int i = rectDAO.deleteByPrimaryKey(rect.gethId());
        SSMUtil.responseBody(i == 1 ? "success" : "fail", request, resp);


    }

    private void update(HttpServletRequest request, HttpServletResponse resp) {

        SSMUtil.getParameters(request, rect);
        int i = rectDAO.updateByPrimaryKeySelective(rect);
        SSMUtil.responseBody(i == 1 ? "success" : "fail", request, resp);
    }

    private void queryAll(HttpServletRequest request, HttpServletResponse resp) {
        ServletContext servletContext = request.getServletContext();
        servletContext.setAttribute("nowJsp", "rect");
        List<Rect> rects = rectDAO.searchAll();
        request.setAttribute("rectMassages", rects);
        SSMUtil.requestMapping("view/flats/list", request, resp);


    }

    private void addPage(HttpServletRequest request, HttpServletResponse resp) {
        SSMUtil.requestMapping("view/flats/add", request, resp);
    }

    private void detailPage(HttpServletRequest request, HttpServletResponse resp) {
        SSMUtil.requestMapping("view/flats/detail", request, resp);
    }

    private void updatePage(HttpServletRequest request, HttpServletResponse resp) {
        SSMUtil.requestMapping("view/flats/edit", request, resp);
    }


    /**
     * 通过session来实现访问次数自增加  一个用户点击次数记录器
     *
     * @param req
     * @param resp
     * @throws IOException
     */
    private void getseesion(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        HttpSession session = req.getSession();
//        输出sessionid
        System.out.println(session.getId());
        //对count设初值或取值加一   注意这个浏览次数不好,最好使用servlet上下文!!!
        Integer count = (Integer) session.getAttribute("count");
        if (count == null) {
            session.setAttribute("count", 1);
        } else {
            count = count + 1;
            session.setAttribute("count", count);
        }
        System.out.println(req.getHttpServletMapping());

        SSMUtil.responseBody("这是" + count + "次访问", req, resp);

    }


}
