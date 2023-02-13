package com.example.jsptest.chapter6;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 쿠키 추출 Servlet
 * cookie.setMaxAge가 없을 경우 브라우저를 종료시키면 해당 쿠키는 삭제됨
 */
@WebServlet(name = "cookie1", value = "/cookie1")
public class CookieTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Cookie c1 = new Cookie("id", "guest");
        c1.setPath("/");
        response.addCookie(c1);
        Cookie c2 = new Cookie("code", "0001");
        c2.setMaxAge(60 * 60 * 3);
        c2.setPath("/");
        response.addCookie(c2);
        Cookie c3 = new Cookie("subject","java");
        c3.setMaxAge(60 * 60 * 24 * 10);
        c3.setPath("/");
        response.addCookie(c3);
        out.println("쿠키 전송 완료");
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {

    }
}
