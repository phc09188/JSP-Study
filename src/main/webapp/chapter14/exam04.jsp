<%--
  Created by IntelliJ IDEA.
  User: itman
  Date: 2023-02-15
  Time: 오전 10:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="num" value="${95}"/>
점수 <c:out value="${num}"/>은

<c:if test="${num>60}">
  합격입니다.
</c:if>

<br>
점수 <c:out value="${num}"/>은
<c:choose>
  <c:when test="${num>=90}">A학점입니다.</c:when>
  <c:when test="${num>=80}">B학점입니다.</c:when>
  <c:when test="${num>=70}">C학점입니다.</c:when>
  <c:when test="${num>=60}">D학점입니다.</c:when>
  <c:otherwise>F학점입니다.</c:otherwise>
</c:choose>