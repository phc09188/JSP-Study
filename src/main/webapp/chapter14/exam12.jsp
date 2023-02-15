<%--
  Created by IntelliJ IDEA.
  User: itman
  Date: 2023-02-15
  Time: 오전 11:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="balance" value="123456.789"/> <br>
<fmt:formatNumber type="currency" value="${balance}"/><br>
<fmt:formatNumber type="number" maxIntegerDigits="3" value="${balance}"/><br>
<fmt:formatNumber type="number" maxFractionDigits="3" value="${balance}"/><br>
<fmt:formatNumber type="number" groupingUsed="3" value="${balance}"/><br>
<fmt:formatNumber type="percent" maxIntegerDigits="3" value="${balance}"/><br>
<fmt:formatNumber type="percent" maxFractionDigits="3" value="${balance}"/><br>
<fmt:formatNumber type="percent" groupingUsed="3" value="${balance}"/><br>
<fmt:formatNumber type="number" pattern="###.###E0" value="${balance}"/><br>

<p>Currency in USA :
  <fmt:setLocale value="en_US"/>
  <fmt:formatNumber value="${balance}" type="currency"/></p>

  <fmt:parseNumber value="1,234.56" pattern="0,000.000" var="num1"/>
  <fmt:parseNumber value="123" var="num2"/>

${num1 + num1}