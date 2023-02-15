<%--
  Created by IntelliJ IDEA.
  User: itman
  Date: 2023-02-15
  Time: 오전 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page import="com.example.jsptest.chapter12.BookBean" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
  ArrayList<BookBean> bookList = new ArrayList<>();
  bookList.add(new BookBean("The Secret", "Byrne, Rhonda", "Atria Books"));
  bookList.add(new BookBean("The Last Lecture","Randy Pausch","hyperion"));
  String[] bookCode = {"소설","역사","인문","정치","미술","종교","여행","과학","만화","건강"};
%>
<c:set var="list" value="<%=bookList%>"/>
<c:forEach items="${list}" var="item">
  ${item.title}/${item.author}/${item.publisher}<br>
</c:forEach>
<hr>
<c:set var="code" value="<%=bookCode%>"/>
<c:forEach var="item" items="${code}">
  <c:out value="${item}"/>
</c:forEach>
<br>
<hr>

<c:forEach var="i" begin="2" end="9">
  <c:forEach var="j" begin="1" end="9">
    ${i} * ${j} = ${i*j} <br>
  </c:forEach>
  <br>
</c:forEach>

<hr>

<c:forEach var="k" begin="1" end="10" step="2">
  ${k}
</c:forEach>
<hr>

<c:forTokens items="소설/역사/인문/정치/미술/종료/여행/과학/만화/건강" delims="/" var="token">
  ${token}
</c:forTokens>