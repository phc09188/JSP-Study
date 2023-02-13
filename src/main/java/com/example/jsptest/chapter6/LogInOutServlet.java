package com.example.jsptest.chapter6;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "logProc", value = "/logProc")
public class LogInOutServlet extends HttpServlet {
    //로그아웃 --> post
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession(false);
        if(session != null && session.getAttribute("id") != null){
            session.invalidate();
            out.print("로그아웃 작업 완료하였습니다.");
        }else{
            out.print("현재 로그인 상태가 아닙니다.");
        }
        out.close();
    }

    //로그인 --> get
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws  IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String id = request.getParameter("id");
        String password = request.getParameter("password");
        if(id.isEmpty() || password.isEmpty()){
            out.print("ID 또는 비밀번호를 입력해주세요.");
            return;
        }
        HttpSession session = request.getSession();
        if(session.isNew() || session.getAttribute("id") == null){
            session.setAttribute("id", id);
            out.print("로그인을 완료하였습니다.");
        }else{
            out.print("현재 로그인 상태가 아닙니다.");
        }
    }
}
