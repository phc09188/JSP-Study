<%@ page import="com.example.jsptest.chapter16.model.MemberVO" %><%--
  Created by IntelliJ IDEA.
  User: itman
  Date: 2023-02-22
  Time: 오후 3:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>수정</title>
</head>
<body>
<h3>수정 정보 검색</h3>
${error}
<form action="/memberSearch.do" method="post">
  ID : <input type="text" name="id"/>
  <input type="hidden" name="job" value="update"/>
  <input type="submit" value="검색"/>
</form>
<% MemberVO member = (MemberVO) request.getAttribute("member");
  if(member != null){%>
<h3> 회원정보 수정 </h3>
<form action="/memberUpdate.do" method="post">
  ID : <input type="text" name="id" readonly value="${member.id}"/><br>
  비밀번호 : <input type="password" name="passwd" value="${member.passwd}"/> <br>
  이름 : <input type="text" name="name" value="${member.name}"/> <br>
  E-Mail : <input type="text" name="mail" value="${member.mail}"/><br>
  <input type="submit" value="수정"/>
</form>
<%}else{%>
  ${result}<p>
<%}%>


</body>
</html>