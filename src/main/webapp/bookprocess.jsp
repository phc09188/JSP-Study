<%--
  Created by IntelliJ IDEA.
  User: itman
  Date: 2023-02-14
  Time: 오후 5:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>BookProcess</title>
</head>
<body>
<jsp:useBean id="book" class="com.example.jsptest.chapter12.BookBean"/>
<jsp:setProperty name="book" property="*"/>
<%
  request.setAttribute("book", book);
%>
<jsp:forward page="bookOutput.jsp"/>
</body>
</html>
