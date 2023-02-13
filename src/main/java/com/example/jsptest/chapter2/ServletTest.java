package com.example.jsptest.chapter2;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class ServletTest extends HttpServlet {
    private String message;
    /**
     Config 가 필요한 경우 init 메소드
        private ServletConfig config;
        public void init(ServletConfig config) throws ServletException {
            this.config = config;
            this.init();
        }
     **/
    public void init(){
        message = "안녕하세요.";
    }
    /**
     * doGet = Get Mapping
     * doPost = Post Mapping
     * doDelete = Delete Mapping
     * doPut = Put Mapping
     * doHead = Header Mapping
     * service = do~ 메소드 보다 먼저 실행되며, Spring에서 Service와 비슷한 행위를 하는 메소드
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html; charset=UTF-8");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
        out.close();
    }
    // 소멸자
    public void destroy() {
    }
}