<%--
  Created by IntelliJ IDEA.
  User: itman
  Date: 2023-02-15
  Time: 오전 10:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="com.example.jsptest.chapter12.BookBean" %>

<% BookBean book = new BookBean();%>
<c:set target="<%=book%>" property="title" value="The Secret"/>
<%=book.getTitle()%><br>

<c:set var="b" value="<%=book%>"/>
<c:set target="${b}" property="author" value="Byrne Rhonda"/>
${b.author}

