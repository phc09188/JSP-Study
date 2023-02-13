package com.example.jsptest.chapter6;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "cookie3", value = "/cookie3")
public class CookieTest3Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int cnt = 0;
        Cookie[] list = request.getCookies();
        for (int i = 0; list != null&& i < list.length; i++) {
            if(list[i].getName().equals("count")){
                cnt = Integer.parseInt(list[i].getValue());
            }
        }
        cnt++;
        Cookie c = new Cookie("count", cnt+"");
        c.setMaxAge(60*60*24*10);
        response.addCookie(c);
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<h2>방문 횟수 : " + cnt);
        out.close();
    }
}
