<%--
  Created by IntelliJ IDEA.
  User: itman
  Date: 2023-02-15
  Time: 오전 9:12
  To change this template use File | Settings | File Templates.
--%>
<%@ tag body-content="empty" pageEncoding="utf-8"%>
<%@ tag import="java.util.Calendar" %>

<% Calendar date = Calendar.getInstance();%>
<%=date.get(Calendar.YEAR)%> -
<%=date.get(Calendar.MONTH) +1%> -
<%=date.get(Calendar.DATE)%>