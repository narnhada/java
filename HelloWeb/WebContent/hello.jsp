<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Hello JSP</title>
	</head>
	<body>
		<h1>Hello JSP</h1>
		<h3>Dynamic Web Page</h3>
		<%--name 파라미터를 전달 받아서 표시 --%>
		<%
		String name = request.getParameter("name");
		if(name == null){
			name = "BIT";
		}
		%>
		<p>Hello, <%= name %> </p>
	
	</body>
</html>