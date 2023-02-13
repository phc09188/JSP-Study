package com.example.jsptest.chapter6;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "sessionTest", value = "/sessionTest")
public class SessionTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String param = request.getParameter("p");
        String msg = null;
        HttpSession session;
        switch (param) {
            case "create":
                session = request.getSession();
                if (session.isNew()) msg = "새로운 객체 생성됨!";
                else msg = "기존의 세션 객체가 리턴됨";
                break;
            case "delete":
                session = request.getSession(false);
                if (session != null) {
                    session.invalidate();
                    msg = "세션 삭제 완료";
                } else msg = "삭제할 세션이 존재하지 않습니다.";
                break;
            case "add":
                session = request.getSession(true);
                session.setAttribute("msg", "메시지입니다.");
                msg = "세션 객체에 데이터 등록 완료";
                break;
            case "get":
                session = request.getSession(false);
                if (session != null) {
                    msg = (String) session.getAttribute(msg);
                } else msg = "데이터를 출력할 세션 객체 존재하지 않음";

                break;
            case "remove":
                session = request.getSession(false);
                if (session != null) {
                    session.removeAttribute("msg");
                    msg = "세션 객체의 데이터 삭제 완료";
                } else msg = "데이터를 삭제할 세션 객체 존재하지 않음";
                break;
            case "replace":
                session = request.getSession();
                session.setAttribute("msg", "새로운 메시지입니다.");
                msg = "세션 객체에 데이터 등록 완료";
                break;
        }
        out.print("처리결과 : " + msg);
        out.close();
    }
}
