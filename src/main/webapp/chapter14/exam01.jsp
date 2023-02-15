<%--
  Created by IntelliJ IDEA.
  User: itman
  Date: 2023-02-15
  Time: 오전 9:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page import="com.example.jsptest.chapter12.BookBean" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="name" value="Amy"/>
<c:out value="${name}"/><br>

<c:remove var="name"/>
<c:out value="${name}"/><br>
<%
  BookBean book = new BookBean("The Secret", "Byrn, Rhonda","Attria Books");
  request.setAttribute("bookOne",book);
%>
<c:set var="title" value="${bookOne.title}"/>
<c:out value="${title}"/><br>

<c:set var="author" value="${bookOne.author}"/>
<c:out value="${author}"/><br>

<c:set var="name" value="${bookOne.author}"/>
<c:out value="${name}"/><br>

<hr>

<c:set var="name">Tobey</c:set>
<c:out value="${name}"/><br>
<%
  BookBean book2 = new BookBean("The Last Lecture", "Randy Pausch","hyperion");
  request.setAttribute("bookTwo", book2);
%>
<c:set var="title">${bookTwo.title}</c:set>
<c:out value="${title}"/><br>
<c:set var="author"><%=book2.getAuthor()%></c:set>
<c:out value="${author}"/><br>