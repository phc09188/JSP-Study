package com.example.jsptest.chapter3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet(name = "headerInfo", value = "/headerInfo")
public class HeaderInfoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=EUC-KR");
        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<head><title>Request 정보 출력 Servlet</title></head>");
        out.print("<body>");
        out.print("<h3>요청 헤더 정보</h3>");
        Enumeration<String> em = request.getHeaderNames();
        while(em.hasMoreElements()){
            String s = em.nextElement();
            out.println(s + " : "+ request.getHeader(s) + "<br/>");
        }
        out.print("</body></html>");
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
