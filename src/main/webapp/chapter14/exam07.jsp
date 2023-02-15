<%--
  Created by IntelliJ IDEA.
  User: itman
  Date: 2023-02-15
  Time: 오전 10:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:import url="exam05.jsp" var="url"/>

<c:url value="exam08.jsp" var="page">
    <c:param name="id" value="guest"/>
    <c:param name="pwd" value="1004"/>
</c:url>
<c:redirect url="${page}"/>