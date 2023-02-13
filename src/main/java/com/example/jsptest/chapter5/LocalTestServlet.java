package com.example.jsptest.chapter5;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "local", value = "/local")
public class LocalTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Servlet 지역변수
        int number = 0;
        String str = request.getParameter("msg");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>MultiThread Test</title></head>");
        out.println("<body><h2>처리결과(지역 변수)</h2>");
        while(number++ < 10){
            out.print(str +" : " + number + "</br>");
            out.flush();
            System.out.println(str +" : " + number);
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e);
            }
        }
        out.println("<h2>Done " + str + " !! </h2>");
        out.println("</body></html>");
        out.close();
    }

}
