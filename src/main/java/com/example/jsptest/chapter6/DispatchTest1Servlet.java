package com.example.jsptest.chapter6;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "dispatcher1", value = "/dispatcher1")
public class DispatchTest1Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("<h3>Dispatcher Test1의 수행결과</h3>");
        ServletContext sc = this.getServletContext();
        RequestDispatcher rd = sc.getRequestDispatcher("/dispatcher2");
        //dispatcher2의 화면이 보여짐
        rd.forward(request,response);
        /*
          dispatcher1과 2가 합쳐서 보여짐.
          rd.include(req,resp);
         */
        out.close();
    }
}
