<%--
  Created by IntelliJ IDEA.
  User: itman
  Date: 2023-02-14
  Time: 오전 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>덧셈</title>
</head>
<body>
<h3> 선언문으로 구현한 덧셈</h3>
<%!
    public int sum(int a, int b){
        return a + b;
    }
%>
덧셈의 결과 : <%=this.sum(20,30)%>
</body>
</html>
