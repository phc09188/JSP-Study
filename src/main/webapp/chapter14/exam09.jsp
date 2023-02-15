<%--
  Created by IntelliJ IDEA.
  User: itman
  Date: 2023-02-15
  Time: 오전 10:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<fmt:requestEncoding value="UTF-8"/>
Parameter : ${param.name}<br>
<form action="exam09.jsp" method="post">
  <label>
    이름 :
    <input type="text" name="name">
  </label>
  <input type="submit" value="전송">
</form>


