<%--
  Created by IntelliJ IDEA.
  User: itman
  Date: 2023-02-21
  Time: 오후 5:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<h3> 회원가입</h3>
<form action="memberProc.jsp" method="post">
  ID : <input type="text" name="id"/><br>
  비밀번호 : <input type="password" name="passwd"/><br>
  이름 : <input type="text" name="name"/><br>
  E-Mail : <input type="text" name="mail"/><br>
  <input type="submit" value="가입">

</form>
