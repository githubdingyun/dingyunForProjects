package com.house.servlet;

import com.house.tools.UrlStitching;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletHouse")
public class ServletHouse extends HttpServlet {


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String requestURI = req.getRequestURI();
        String endurl = UrlStitching.endurl(requestURI);
        if ("add".equals(endurl)) {
            add(req, resp);
        } else if ("delete".equals(endurl)) {
            delete(req, resp);
        } else if ("update".equals(endurl)) {
            update(req, resp);

        } else if ("queryAll".equals(endurl)) {
            queryAll(req, resp);
        } else {

        }

        super.service(req, resp);
    }

    private void add(HttpServletRequest request, HttpServletResponse resp) throws IOException {


    }

    private void delete(HttpServletRequest request, HttpServletResponse resp) throws IOException {


    }

    private void update(HttpServletRequest request, HttpServletResponse resp) throws IOException {


    }

    private void queryAll(HttpServletRequest request, HttpServletResponse resp) throws IOException {


    }




}
