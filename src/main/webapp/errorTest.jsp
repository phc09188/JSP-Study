<%--
  Created by IntelliJ IDEA.
  User: itman
  Date: 2023-02-14
  Time: 오전 10:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ page errorPage="errorPage.jsp" %>
<%
  String param = request.getParameter("id");
  if(param.equals("test"))
    param = "파라미터가 입력되었습니다. (예외가 발생하지 않았습니다.)";
%>
<html>
<head>
    <title>예외상황 처리</title>
</head>
<body>
<h4>
  <%=param%>
</h4>
</body>
</html>
