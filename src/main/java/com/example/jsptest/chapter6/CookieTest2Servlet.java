package com.example.jsptest.chapter6;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 쿠키 정보 출력
 */
@WebServlet(name = "cookie2", value = "/cookie2")
public class CookieTest2Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        Cookie[] list = request.getCookies();
        for (int i = 0; list !=null && i < list.length; i++) {
            out.println(list[i].getName()+" : " + list[i].getValue()+ "<br>");
        }
        out.close();
    }
}
