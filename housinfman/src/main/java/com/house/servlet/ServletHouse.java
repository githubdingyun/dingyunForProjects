package com.house.servlet;

import com.house.dao.impl.HouseDAOImpl;
import com.house.pojo.House;
import com.house.tools.SSMUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 增删改操作使用ajax来实现,
 * @author DinGYun
 */
public class ServletHouse extends HttpServlet {

    House house = new House();
    HouseDAOImpl houseDAO = new HouseDAOImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SSMUtil.serviceMapping(getClass(), req, resp);
        super.service(req, resp);
    }

    private void add(HttpServletRequest request, HttpServletResponse resp) throws IOException {
        SSMUtil.getParameters(request, house);
        int i = houseDAO.insert(house);
        if(i==1){
            SSMUtil.responseBody("success",request, resp);
        }else{
            SSMUtil.responseBody("fail",request, resp);
        }
    }

    private void delete(HttpServletRequest request, HttpServletResponse resp) throws IOException {
        SSMUtil.getParameters(request, house);
        int i = houseDAO.deleteByPrimaryKey(house.gethId());
        if(i==1){
            SSMUtil.responseBody("success",request, resp);
        }else{
            SSMUtil.responseBody("fail",request, resp);
        }


    }

    private void update(HttpServletRequest request, HttpServletResponse resp) throws IOException {

        SSMUtil.getParameters(request, house);
        int i = houseDAO.updateByPrimaryKeySelective(house);
        if(i==1){
            SSMUtil.responseBody("success",request, resp);
        }else{
            SSMUtil.responseBody("fail",request, resp);
        }
    }

    private void queryAll(HttpServletRequest request, HttpServletResponse resp) throws IOException {

        List<House> houses = houseDAO.searchAll();
        request.setAttribute("houses",houses);
        SSMUtil.requestMapping("view/deal/list",request, resp);


    }




}
