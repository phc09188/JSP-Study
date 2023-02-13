package com.example.jsptest.chapter6;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "bookOutput", value = "/bookOutput")
public class BookTest2Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Book book = (Book) request.getAttribute("book");
        out.print("<h3>책제목 : " + book.getTitle() + " </h3>");
        out.print("<h3>책저자 : " + book.getAuthor() + " </h3>");
        out.print("<h3>출판사 : " + book.getPublisher() + " </h3>");
        out.close();
    }
}
