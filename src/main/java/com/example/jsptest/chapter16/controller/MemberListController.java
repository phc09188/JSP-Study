package com.example.jsptest.chapter16.controller;

import com.example.jsptest.chapter16.model.MemberVO;
import com.example.jsptest.chapter16.service.MemberService;
import com.example.jsptest.chapter16.util.HttpUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class MemberListController implements Controller {
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        MemberService service = MemberService.getInstance();
        List<MemberVO> list = service.memberList();
        request.setAttribute("list", list);
        HttpUtil.forward(request,response,"/chapter16/memberListOutput.jsp");
    }
}
