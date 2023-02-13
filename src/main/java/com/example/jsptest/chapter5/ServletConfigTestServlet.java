package com.example.jsptest.chapter5;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "servletConfigTest", value = "/servletConfigTest")
public class ServletConfigTestServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        // this.~ init 파라미터로 설정한 charset 정보를 가져오는 부분
        String env = this.getInitParameter("charset");
        request.setCharacterEncoding(env);
        out.print("<h3>이름 : " + request.getParameter("name"));
        out.close();
    }
}
