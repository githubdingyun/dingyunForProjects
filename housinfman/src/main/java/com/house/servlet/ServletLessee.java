package com.house.servlet;

import com.house.dao.impl.LesseeDAOImpl;
import com.house.pojo.Lessee;
import com.house.tools.SSMUtil;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ServletLessee")
public class ServletLessee extends HttpServlet {
    private Lessee lessee = new Lessee();
    private LesseeDAOImpl lesseeDAO = new LesseeDAOImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SSMUtil.serviceMapping(getClass(), req, resp);
    }

    private void add(HttpServletRequest request, HttpServletResponse resp) {
        SSMUtil.getParameters(request, lessee);
        int i = lesseeDAO.insert(lessee);
        SSMUtil.responseBody(i == 1 ? "success" : "fail", request, resp);
    }

    private void delete(HttpServletRequest request, HttpServletResponse resp) {
        SSMUtil.getParameters(request, lessee);
        System.out.println(lessee);
        int i = lesseeDAO.deleteByPrimaryKey(lessee.getlId());
        SSMUtil.responseBody(i == 1 ? "success" : "fail", request, resp);


    }

    private void update(HttpServletRequest request, HttpServletResponse resp) {

        SSMUtil.getParameters(request, lessee);
        int i = lesseeDAO.updateByPrimaryKeySelective(lessee);
        SSMUtil.responseBody(i == 1 ? "success" : "fail", request, resp);
    }

    private void queryAll(HttpServletRequest request, HttpServletResponse resp) {
        ServletContext servletContext = request.getServletContext();
        servletContext.setAttribute("nowJsp", "less");
        List<Lessee> lessees = lesseeDAO.searchAll();
        request.setAttribute("lessMessages", lessees);
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

}
