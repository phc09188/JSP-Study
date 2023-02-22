package com.example.jsptest.chapter16.controller;

import com.example.jsptest.chapter16.service.MemberService;
import com.example.jsptest.chapter16.util.HttpUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MemberDeleteController implements Controller {
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");

        MemberService service = MemberService.getInstance();
        service.memberDelete(id);
        HttpUtil.forward(request,response,"/chapter16/memberDeleteOutput.jsp");
    }
}
