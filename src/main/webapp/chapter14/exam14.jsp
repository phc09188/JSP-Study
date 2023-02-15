<%--
  Created by IntelliJ IDEA.
  User: itman
  Date: 2023-02-15
  Time: 오전 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:set var="now" value="<%=new java.util.Date()%>"/>
대한민국 : <fmt:formatDate value="${now}" type="both" dateStyle="full" timeStyle="full"/><br>
<fmt:timeZone value="en_us">
  미국 : <fmt:formatDate value="${now}" type="both" dateStyle="full" timeStyle="full"/><br>

</fmt:timeZone>

<fmt:timeZone value="ja_jp">
  일본 : <fmt:formatDate value="${now}" type="both" dateStyle="full" timeStyle="full"/>
</fmt:timeZone>
<hr>

<h4>한국</h4>
<fmt:setLocale value="ko_kr"/>
<c:set var="date" value="<%=new java.util.Date()%>"/>
금액 : <fmt:formatNumber value="100000" type="currency"/> <br>
일시 : <fmt:formatDate value="${date}" type="both" dateStyle="full" timeStyle="full"/><br>

<h4>미국</h4>
<fmt:setLocale value="en_us"/>
<c:set var="date" value="<%=new java.util.Date()%>"/>
금액 : <fmt:formatNumber value="100000" type="currency"/> <br>
일시 : <fmt:formatDate value="${date}" type="both" dateStyle="full" timeStyle="full"/><br>

<h4>일본</h4>
<fmt:setLocale value="ja_jp"/>
<c:set var="date" value="<%=new java.util.Date()%>"/>
금액 : <fmt:formatNumber value="100000" type="currency"/> <br>
일시 : <fmt:formatDate value="${date}" type="both" dateStyle="full" timeStyle="full"/><br>



