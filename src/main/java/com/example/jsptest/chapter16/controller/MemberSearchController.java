package com.example.jsptest.chapter16.controller;

import com.example.jsptest.chapter16.model.MemberVO;
import com.example.jsptest.chapter16.service.MemberService;
import com.example.jsptest.chapter16.util.HttpUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MemberSearchController implements Controller {
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String job = request.getParameter("job");
        String path = null;
        if (job.equals("search")) {
            path = "/chapter16/memberSearch.jsp";
        } else if (job.equals("update")) {
            path = "/chapter16/memberUpdate.jsp";
        }else if(job.equals("delete")){
            path = "/chapter16/memberDelete.jsp";
        }
        if(id.isEmpty()){
            request.setAttribute("error","ID를 입력해주시기 바랍니다!");
            HttpUtil.forward(request,response,path);
            return;
        }
        MemberService service = MemberService.getInstance();
        MemberVO member = service.memberSearch(id);
        if(member == null)
            request.setAttribute("result", "검색된 정보가 없습니다!");
        request.setAttribute("member", member);
        if(job.equals("search")) path="/chapter16/memberSearchOutput.jsp";
        HttpUtil.forward(request,response,path);
    }
}
