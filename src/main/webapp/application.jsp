<%--
  Created by IntelliJ IDEA.
  User: itman
  Date: 2023-02-14
  Time: 오후 1:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <title>application</title>
</head>
<body>
서버명 : <%=application.getServerInfo()%><br>
서블릿 버전 : <%=application.getMajorVersion()%> ,<%=application.getMinorVersion()%><br>
<h3>/edu 리스트</h3>
<%
    java.util.Set<String> list = application.getResourcePaths("/");
    if(list != null){
        Object[] obj = list.toArray();
        for (Object o : obj) {
            out.print(o + "<br>");
        }
    }
%>
</body>
</html>
