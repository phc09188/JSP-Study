<%--
  Created by IntelliJ IDEA.
  User: itman
  Date: 2023-02-14
  Time: 오후 5:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Book Input</title>
</head>
<body>
<form action="bookprocess.jsp" method="post">
    책제목 : <label>
    <input type="text" name="title">

</label> <br>
    책저자 : <label>
    <input type="text" name="author">

</label> <br>
    <label>
        출판사 :
        <input type="text" name="publisher">
    </label><br>
    <input type="submit" value="등록"/>
</form>
</body>
</html>
