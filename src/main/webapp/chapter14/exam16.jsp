<%--
  Created by IntelliJ IDEA.
  User: itman
  Date: 2023-02-15
  Time: 오전 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<sql:setDataSource var="mysql2"
                   driver="com.mysql.jdbc.Driver"
                   url="jdbc:mysql://localhost:3307/test"
                   user="root"
                   password="1234"/>
<sql:query var="result" dataSource="${mysql2}">
    select * from dept
</sql:query>

<table border="1">
    <tr>
        <th>DEPTNP</th>
        <th>DNAME</th>
        <th>Location</th>
    </tr>
    <c:forEach var="row" items="${result.rows}">
        <tr>
            <td><c:out value="${row.deptno}"/></td>
            <td><c:out value="${row.dname}"/></td>
            <td><c:out value="${row.loc}"/></td>
        </tr>
    </c:forEach>
</table>
