package com.house.servlet;

import com.house.dao.impl.HouseDAOImpl;
import com.house.pojo.House;
import com.house.tools.SSMUtil;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
/**
 * 增删改操作使用ajax来实现,
 *
 * @author DinGYun
 */
public class ServletHouse extends HttpServlet {

    private House house = new House();
    private HouseDAOImpl houseDAO = new HouseDAOImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SSMUtil.serviceMapping(getClass(), req, resp);
    }

    private void add(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
//        SSMUtil.getParameters(request, house);
//        int i = houseDAO.insert(house);
        request.getRequestDispatcher("/WEB-INF/pages/view/flats/add.jsp").forward(request, resp);
    }

    private void delete(HttpServletRequest request, HttpServletResponse resp) {
        SSMUtil.getParameters(request, house);
        System.out.println(house);
        int i = houseDAO.deleteByPrimaryKey(house.gethId());
        SSMUtil.responseBody(i == 1 ? "success" : "fail", request, resp);


    }

    private void update(HttpServletRequest request, HttpServletResponse resp) {

        SSMUtil.getParameters(request, house);
        int i = houseDAO.updateByPrimaryKeySelective(house);
        SSMUtil.responseBody(i == 1 ? "success" : "fail", request, resp);
    }

    private void queryAll(HttpServletRequest request, HttpServletResponse resp) {
        ServletContext servletContext = request.getServletContext();
        servletContext.setAttribute("nowJsp", "house");
        List<House> houses = houseDAO.searchAll();
        request.setAttribute("houseMessages", houses);
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

    private void hh(HttpServletRequest request, HttpServletResponse resp) {
        List<House> houses = houseDAO.searchAll();
        SSMUtil.responseBody(houses.toString(), request, resp);
    }


}
