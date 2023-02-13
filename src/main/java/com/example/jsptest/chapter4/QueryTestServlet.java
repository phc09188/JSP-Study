package com.example.jsptest.chapter4;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "queryTest", value = "/queryTest")
public class QueryTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<head><title>Query 문자열 테스트</title></head>");
        out.print("<body>");
        out.print("<h1>GET 방식으로 처리되었습니다.</h1>");
        out.println("</body></html>");
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<head><title>질의 문자열 테스트</title></head>");
        out.print("<body>");
        out.print("<h1>POST 방식으로 처리되었습니다.</h1>");
        String id = request.getParameter("id");
        String password = request.getParameter("pwd");
        String name = request.getParameter("name");
        String[] hobbies = request.getParameterValues("hobby");
        String gender = request.getParameter("gender");
        String religion = request.getParameter("religion");
        String intro = request.getParameter("introduction");
        out.print("ID : "+ id + "</br>");
        out.print("비밀번호 : "+ password + "</br>");
        out.print("이름 : "+ name + "</br>");
        out.print("취미 : ");
        for (int i = 0; i < hobbies.length; i++) {
            out.print(hobbies[i] + " ");
        }
        out.print("</br>");
        out.print("성별 : " + gender + "</br>");
        out.print("종교 : " + religion + "</br>" );
        out.print("소개 : " + intro + "</br>");
        out.println("</body></html>");
        out.close();
    }
}
