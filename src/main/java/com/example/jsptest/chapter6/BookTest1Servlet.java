package com.example.jsptest.chapter6;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "bookReg", value = "/bookReg")
public class BookTest1Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        request.setCharacterEncoding("UTF-8");
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        String publisher = request.getParameter("publisher");
        Book b = new Book(title,author,publisher);
        request.setAttribute("book", b);

        RequestDispatcher rd = request.getRequestDispatcher("bookOutput");
        rd.forward(request, response);
        out.close();
    }
}
