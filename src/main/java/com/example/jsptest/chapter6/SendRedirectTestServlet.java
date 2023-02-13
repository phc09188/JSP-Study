package com.example.jsptest.chapter6;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "portalSite", value = "/portalSite")
public class SendRedirectTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String param = request.getParameter("site");
        switch (param){
            case "naver":
                response.sendRedirect("http://www.naver.com");
                break;
            case "daum":
                response.sendRedirect("http://www.daum.net");
                break;
            case "zum":
                response.sendRedirect("http://zum.com");
                break;
            case "google":
                response.sendRedirect("http://google.com");
                break;
        }
    }
}
