<%--
  Created by IntelliJ IDEA.
  User: itman
  Date: 2023-02-15
  Time: 오전 9:12
  To change this template use File | Settings | File Templates.
--%>
<%@ tag body-content="scriptless" pageEncoding="utf-8"%>

<%@ attribute name="title" required="true" %>
<%@ attribute name="color" required="true" %>


<p>
    <table border="1">
        <tr>
            <th>${title}</th>
        </tr>
        <tr>
            <td bgcolor="${color}"><jsp:doBody/></td>
        </tr>
    </table>
</p>