package com.example.jsptest.chapter3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "addInfo", value = "/addInfo")
public class AdditionalInfoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=EUC-KR");
        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<head><title>Request 정보 출력 Servlet</title></head>");
        out.print("<body>");
        out.print("<h3>추가적인 정보 요청</h3>");
        out.print("Request Method : " + request.getMethod() + "</br>");
        out.print("Path Info : " + request.getPathInfo() + "</br>");
        out.print("Path Translated : " + request.getPathTranslated() + "</br>");
        out.print("Query String : " + request.getQueryString() + "</br>");
        out.print("Content Length : " + request.getQueryString() + "</br>");
        out.print("Content Type : " + request.getContentType() + "</br>");
        out.print("</body></html>");
        out.close();

    }
}
