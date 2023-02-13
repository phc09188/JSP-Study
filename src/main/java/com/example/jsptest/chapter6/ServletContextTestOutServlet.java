package com.example.jsptest.chapter6;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "contextOut", value = "/contextOut")
public class ServletContextTestOutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        ServletContext sc = this.getServletContext();
        ShareObject obj1 = (ShareObject) sc.getAttribute("data1");
        ShareObject obj2 = (ShareObject) sc.getAttribute("data2");
        out.print("DATA 1 : " + obj1.getCount() + ", "+ obj1.getStr() + "<br>");
        out.print("DATA 2 : " + obj2.getCount() + ", "+ obj2.getStr() + "<br>");
        out.close();

    }
}
