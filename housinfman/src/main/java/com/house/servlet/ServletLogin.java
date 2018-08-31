package com.house.servlet;

import com.house.dao.impl.HouseDAOImpl;
import com.house.dao.impl.UserDAOImpl;
import com.house.pojo.House;
import com.house.tools.SSMUtil;
import org.json.JSONArray;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * @author DinGYun
 * 模仿ssm的实现在一个sevlet里解析很多路径
 * 模仿ssm视图解析器
 * ssm实际是封装了一个modelandview类以及对类的一些操作来实现而已
 * 传入参数工具类:实际是有一个类实现了名字对比而已
 */
public class ServletLogin extends HttpServlet {
    UserDAOImpl userDAO = new UserDAOImpl();

    HouseDAOImpl houseDAO = new HouseDAOImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SSMUtil.serviceMapping(getClass(), req, resp);
    }


    private void userlogin(HttpServletRequest req, HttpServletResponse resp) throws IOException {
                SSMUtil.requestMapping("admin", req, resp);
    }

    private void accountVerification(HttpServletRequest request, HttpServletResponse resp) throws IOException {
        ServletContext servletContext = request.getServletContext();
        servletContext.setAttribute("nowJsp", "house");
        List<House> houses = houseDAO.searchAll();
        request.setAttribute("houseMessages", houses);
        JSONArray jsonArray =  new JSONArray();
        JSONArray put = jsonArray.put(houses);
        SSMUtil.responseBody(put.toString(),request, resp);


    }

    private void userRights(HttpServletRequest request, HttpServletResponse resp) throws IOException {


    }

    private void userlogout(HttpServletRequest request, HttpServletResponse resp) throws IOException {
        HttpSession session = request.getSession();
        session.invalidate();
        SSMUtil.requestMapping("login.html", request, resp);
    }

}
