package com.example.jsptest.chapter16.controller;

import com.example.jsptest.chapter16.model.MemberVO;
import com.example.jsptest.chapter16.service.MemberService;
import com.example.jsptest.chapter16.util.HttpUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MemberUpdateController implements Controller {
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String passwd = request.getParameter("passwd");
        String mail = request.getParameter("mail");
        if (id.isEmpty() || name.isEmpty() || passwd.isEmpty() || mail.isEmpty()) {
            request.setAttribute("error", "모든 항목을 빠짐없이 입력해주시기바랍니다!");
            HttpUtil.forward(request, response, "/chapter16/memberUpdate.jsp");
            return;
        }
        MemberVO member = new MemberVO();
        member.setId(id);
        member.setName(name);
        member.setPasswd(passwd);
        member.setMail(mail);
        MemberService servie = MemberService.getInstance();
        servie.memberUpdate(member);
        request.setAttribute("id", id);
        HttpUtil.forward(request,response,"/chapter16/memberUpdateOutput.jsp");
    }
}
