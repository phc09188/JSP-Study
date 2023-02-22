<%@ page import="com.example.jsptest.chapter16.model.MemberVO" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: itman
  Date: 2023-02-22
  Time: 오후 4:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>회원정보</title>
</head>
<body>
<% List<MemberVO> list = (List<MemberVO>) request.getAttribute("list");
if(!list.isEmpty()){%>
<table border="1">
  <tr>
    <th>ID</th>
    <th>비밀번호</th>
    <th>이름</th>
    <th>이메일</th>
  </tr>
  <%
    for (MemberVO member : list) {
  %>
  <tr>
    <td><%=member.getId()%>
    </td>
    <td><%=member.getPasswd()%>
    </td>
    <td><%=member.getName()%>
    </td>
    <td><%=member.getMail()%>
    </td>
  </tr>
  <% }
}else{
  out.print("<h3> 등록된 회원정보가 없습니다. </h3>");
}%>
</table>
<%@include file="home.jsp"%>
</body>
</html>
