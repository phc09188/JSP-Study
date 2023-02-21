<%--
  Created by IntelliJ IDEA.
  User: itman
  Date: 2023-02-21
  Time: 오후 5:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.example.jsptest.chapter15.model.Member" %>
<%@ page import="com.example.jsptest.chapter15.service.MemberService" %>
<%
  request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="member" class="com.example.jsptest.chapter15.model.Member"/>
<jsp:setProperty name="member" property="*"/>
<%
  MemberService service = new MemberService();
  service.memberInsert(member);
  RequestDispatcher rd = request.getRequestDispatcher("memberOutput.jsp");
  rd.forward(request,response);
%>