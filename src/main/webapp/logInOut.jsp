<%--
  Created by IntelliJ IDEA.
  User: itman
  Date: 2023-02-14
  Time: 오전 11:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Input</title>
</head>
<body>
<% if(session.isNew() || session.getAttribute("id") == null){%>
    <%
        String msg = (String) request.getAttribute("error");
        if(msg == null) msg = "";
    %>
    <%=msg%>
    <form action="info.jsp" method="post">
        <label>
            ID :
            <input type="text" name="id">
        </label><br>
        <label>
            비밀번호 :
            <input type="password" name="password">
        </label><br>
      <input type="submit" value="로그인"/>
    </form>
<%}else {%>
    <a href="info.jsp">로그아웃</a>
<%}%>
</body>
</html>
