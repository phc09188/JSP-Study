<%--
  Created by IntelliJ IDEA.
  User: itman
  Date: 2023-02-14
  Time: 오후 3:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@page import="java.sql.*" %>
<%@page import="javax.sql.*" %>
<%@page import="javax.naming.*" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<%
  try {
    InitialContext ic = new InitialContext();
    DataSource ds = (DataSource) ic.lookup("java:comp/env/jdbc/mysql");
    Connection conn = ds.getConnection();
    Statement stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery("select * from test");
    while (rs.next()) {
      out.print("<br>" + rs.getString("id") + ":" + rs.getString("pwd"));
    }
    rs.close();
    stmt.close();
    conn.close();
  }catch (Exception e){
    System.out.println(e.getMessage());
  }
%>
</body>
</html>
