<%--
  Created by IntelliJ IDEA.
  User: itman
  Date: 2023-02-14
  Time: 오후 2:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Java Bean</title>
</head>
<body>
<jsp:useBean class="com.example.jsptest.chapter10.beans.HelloBean" id="hello"/>

<jsp:getProperty  property="name" name="hello" />
<jsp:getProperty  property="number" name="hello"/>

<jsp:setProperty  property="name" name="hello" value="Amy" />
<jsp:setProperty  property="number" name="hello" value="12345"/>

<jsp:getProperty  property="name" name="hello" />
<jsp:getProperty  property="number" name="hello"/>
</body>
</html>
