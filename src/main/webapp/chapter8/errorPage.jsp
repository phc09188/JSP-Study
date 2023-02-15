<%--
  Created by IntelliJ IDEA.
  User: phc09188
  Date: 2023-02-14
  Time: 오전 10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page isErrorPage="true" %>
<html>
<head>
    <title>예외 처리</title>
</head>
<body>
    <h4>다음과 같은 에러가 발생하였습니다.</h4>
    에러타입 :
    <%=exception.getClass().getName()%>
    <br> 에러메시지:
    <%=exception.getMessage()%>
</body>
</html>
