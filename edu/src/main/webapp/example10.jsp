<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%String id = request.getParameter("id"); 
	  String pwd = request.getParameter("pwd");
	
	  if (id.isBlank() || pwd.isBlank()){
		  request.setAttribute("error", "ID 또는 비밀번호를 입력해주세요");
		  RequestDispatcher rd = request.getRequestDispatcher("loginOut.jsp");
		  rd.forward(request, response);
		  return;
	  }
	  //로그인처리
	  if (session.isNew() || session.getAttribute("id") == null ){
		  session.setAttribute("id",id);
		  out.print("로그인 작업이 완료되었습니다.");
	  } else {
		  out.print("이미 로그인 상태입니다.");
	  }
		  
	  
	  
	%>
	<%= id %> / <%= pwd %>
	

</body>
</html>