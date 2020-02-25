<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="true"%>
<%
String userId = (String)session.getAttribute("userId");
String name = (String)session.getAttribute("name");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션 읽기</title>
</head>
<body>
	<h1>세션 읽기</h1>
	<h3>세션 값 확인</h3>
	<p>userId: <%=userId %></p>
	<p>name: <%=name %></p>
	
	<a href="session_delete.jsp">세션 삭제</a>
</body>
</html>