package com.example.jsptest.chapter3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "netInfo", value = "/netInfo")
public class NetInfoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=EUC-KR");
        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<head><title>Request 정보 출력 Servlet</title></head>");
        out.print("<body>");
        out.print("<h3>네트워크 관련 정보</h3>");
        out.print("Request Scheme : " + request.getScheme() + "</br>");
        out.print("Server name : " + request.getServerName() + "</br>");
        out.print("Server Address : " + request.getLocalAddr() + "</br>");
        out.print("Server Port : " + request.getServerPort() + "</br>");
        out.print("Client Address : " + request.getRemoteAddr() + "</br>");
        out.print("Client Host : " + request.getRemoteHost() + "</br>");
        out.print("Client Port : " + request.getRemotePort() + "</br>");
        out.print("</body></html>");
        out.close();


    }

}
