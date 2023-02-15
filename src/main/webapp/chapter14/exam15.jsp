<%--
  Created by IntelliJ IDEA.
  User: itman
  Date: 2023-02-15
  Time: 오전 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>

<sql:update dataSource="jdbc/mysql">
  update test set pwd=? where id=?
  <sql:param value="${'555'}"/>
  <sql:param value="${'aa'}"/>
</sql:update>

<sql:query var="rs" dataSource="jdbc/mysql">
  select * from test
</sql:query>
<table>
  <tr>
    <c:forEach var="columnName" items="${rs.columnNames}">
      <th><c:out value="${columnName}"/></th>
    </c:forEach>
  </tr>
  <c:forEach var="row" items="${rs.rows}">
    <tr>
      <td><c:out value="${row.id}"/></td>
      <td><c:out value="${row.pwd}"/></td>
    </tr>
  </c:forEach>
</table>


