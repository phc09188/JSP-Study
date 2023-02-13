package com.example.jsptest.chapter5;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "initParamTest", value = "/initParamTest")
public class InitParamServlet extends HttpServlet {
    String id, password;
    @Override
    public void init(ServletConfig config){
        id = config.getInitParameter("id");
        password = config.getInitParameter("password");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws  IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("<h2>서블릿 초기 추출 변수</h2>");
        out.print("<h3>ID : "+ id +"</h3>");
        out.print("<h3>PASSWORD : "+ password + "</h3>");
        out.close();
    }
}
