<%--
  Created by IntelliJ IDEA.
  User: itman
  Date: 2023-02-14
  Time: 오후 3:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page import="java.sql.*" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
  try {
    // JDBC Driver 로딩
    Class.forName("com.mysql.jdbc.Driver");
    // DB 서버 접속하기
    String url = "jdbc:mysql://localhost:3307/test";
    Connection conn = DriverManager.getConnection(url, "root", "1234");
    // Statement or PreparedStatement 객체 생성하기
    Statement stmt = conn.createStatement();
    //table 생성
//  stmt.executeUpdate("create table test(id varchar(5), pwd varchar(5))");
    // row 추가
    stmt.executeUpdate("insert into test values('aa','11')");
    stmt.executeUpdate("insert into test values('bb','22')");
    stmt.executeUpdate("insert into test values('cc','33')");
    // row 조회
    ResultSet rs = stmt.executeQuery("select * from test");
    while (rs.next()) {
      out.print("<br>" + rs.getString("id") + " : " + rs.getString("pwd"));
    }
    //연결해제
    rs.close();
    stmt.close();
    conn.close();
  }catch (Exception e){
    System.out.println(e.getMessage());
  }
%>
</body>
</html>
