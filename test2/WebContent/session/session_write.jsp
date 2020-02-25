<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page session="true"%> <!-- JSP에서 세션 사용 -->
<%
session.setAttribute("userId","kim");
session.setAttribute("name","김병희");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션 저장 테스트</title>
</head>
	<body>
		<h1>세션 저장</h1>
		<a href="session_read.jsp">세션 변수 확인</a>
	</body>
</html>