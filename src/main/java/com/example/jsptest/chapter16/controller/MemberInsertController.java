package com.example.jsptest.chapter16.controller;

import com.example.jsptest.chapter16.service.MemberService;
import com.example.jsptest.chapter16.model.MemberVO;
import com.example.jsptest.chapter16.util.HttpUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MemberInsertController implements Controller {
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String passwd = request.getParameter("passwd");
        String name = request.getParameter("name");
        String mail = request.getParameter("mail");
        if(id.isEmpty() || passwd.isEmpty() || name.isEmpty() || mail.isEmpty()){
            request.setAttribute("error","모든 항목을 입력해주세요.");
            HttpUtil.forward(request,response,"/chapter16/memberInsert.jsp");
            return;
        }
        MemberVO member = new MemberVO();
        member.setId(id);
        member.setPasswd(passwd);
        member.setName(name);
        member.setMail(mail);

        MemberService service = MemberService.getInstance();
        service.memberInsert(member);

        request.setAttribute("id",id);
        HttpUtil.forward(request,response,"/chapter16/memberInsertOutput.jsp");
    }
}
