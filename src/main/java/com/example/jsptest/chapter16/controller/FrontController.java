package com.example.jsptest.chapter16.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 해당 미니 프로젝트는 MVC Model2 버전으로
 * FrontController 디자인패턴을 추가했습니다.
 */
public class FrontController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    String charset = null;
    Map<String,Controller> list = null;
    @Override
    public void init(ServletConfig sc) throws ServletException{
        charset = sc.getInitParameter("charset");
        list = new HashMap<>();
        list.put("/memberInsert.do", new MemberInsertController());
        list.put("/memberSearch.do", new MemberSearchController());
        list.put("/memberUpdate.do", new MemberUpdateController());
        list.put("/memberDelete.do", new MemberDeleteController());
        list.put("/memberList.do", new MemberListController());
    }
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        request.setCharacterEncoding(charset);
        String url = request.getRequestURI();
        String contextPath = request.getContextPath();
        String path = url.substring(contextPath.length());
        // 모든 Controller는 Controller객체를 상속받아 사용하기 때문에 가능
        Controller subController = list.get(path);
        subController.execute(request,response);
    }

}
