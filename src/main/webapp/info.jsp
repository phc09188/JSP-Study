<%--
  Created by IntelliJ IDEA.
  User: itman
  Date: 2023-02-14
  Time: 오전 11:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <title>Result</title>
</head>
<body>
<%
  if(request.getMethod().equals("POST")) {
    String id = request.getParameter("id");
    String password = request.getParameter("password");
    if (id.isEmpty() || password.isEmpty()) {
      request.setAttribute("error", "ID 또는 비밀번호를 입력해주세요!");
      RequestDispatcher rd = request.getRequestDispatcher("logInOut.jsp");
      rd.forward(request, response);
      return;
    }
    //로그인 상태 확인 작업
    if (session.isNew() || session.getAttribute("id") == null) {
      session.setAttribute("id", id);
      out.print("로그인 작업이 완료되었습니다.");
    } else {
      out.print("이미 로그인 상태입니다.");
    }
%>
    <%=id%> / <%=password%>
<%  }else if(request.getMethod().equals("GET")){
    if(session != null && session.getAttribute("id")!= null){
      session.invalidate();
      out.print("로그아웃 작업이 완료되었습니다.");
    } else{
      out.print("현재 로그인 상태가 아닙니다.");
    }
    RequestDispatcher rd = request.getRequestDispatcher("logInOut.jsp");
    rd.forward(request,response);
  }
%>
</body>
</html>
