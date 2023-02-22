<%--
  Created by IntelliJ IDEA.
  User: itman
  Date: 2023-02-22
  Time: 오후 4:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>생성</title>
</head>
<body>
<h3> 회원가입</h3>
<form action="/memberInsert.do" method="post">
  ID : <input type="text" name="id"/><br>
  비밀번호 : <input type="password" name="passwd"/><br>
  이름 : <input type="text" name="name"/><br>
  E-Mail : <input type="text" name="mail"/><br>
  <input type="submit" value="가입">

</form>

</body>
</html>
