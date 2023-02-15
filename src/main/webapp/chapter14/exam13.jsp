<%--
  Created by IntelliJ IDEA.
  User: itman
  Date: 2023-02-15
  Time: 오전 11:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:set var="now" value="<%= new java.util.Date()%>"/>
<fmt:formatDate value="${now}" type="time" /><br>
<fmt:formatDate value="${now}" type="date" /><br>
<fmt:formatDate value="${now}" type="both" /><br>
<fmt:formatDate value="${now}" type="both" dateStyle="short"/><br>
<fmt:formatDate value="${now}" type="both" dateStyle="medium" timeStyle="medium"/><br>
<fmt:formatDate value="${now}" type="both" dateStyle="long" timeStyle="long"/><br>
<fmt:formatDate pattern="yyyy-MM-dd" value="${now}"/><br>
<fmt:parseDate value="2016-12-24 09:03:23" pattern="yyyy-MM-dd HH:mm:ss" var="date"/>
<p>${date}</p>

