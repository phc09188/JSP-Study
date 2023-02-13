package com.example.jsptest.chapter6;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "context", value = "/context")
public class ServletContextTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        ServletContext sc = this.getServletContext();
        ShareObject obj1 = new ShareObject();
        ShareObject obj2 = new ShareObject();
        obj1.setCount(100); obj1.setStr("객체 공유 테스트 -1");
        obj2.setCount(200); obj2.setStr("객체 공유 테스트 -2");
        sc.setAttribute("data1",obj1);
        sc.setAttribute("data2",obj2);
        out.print("ServletContext 객체에 데이터 등록을 하였습니다.!");
        out.close();
    }
}
