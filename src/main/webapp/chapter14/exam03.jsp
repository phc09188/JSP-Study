<%--
  Created by IntelliJ IDEA.
  User: itman
  Date: 2023-02-15
  Time: 오전 10:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>

<%
  String str = request.getParameter("msg");
%>
<c:catch var="e">
  <%
    if(str.equals("add")){
      out.print(str);
    }
  %>
</c:catch>
<c:out value="${e}"/>