<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
// request에 등록된 exampleCookie를 받아와서 저장
String cookieValue = (String)request.getAttribute("exampleCookie");
System.out.println("쿠키값:" + cookieValue);
if(cookieValue == null){
	cookieValue= "";
}

%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Cookie Test</title>
	</head>
		<body>
			<h1>Cookie Test Form</h1>
			
			<form method="POST" action="cookies">
				쿠키 설정할 값
				<input type="text" name="example" value="<%= cookieValue %>">					
				<input type="submit" value="전송">
			</form>
			<a href="<%= request.getContextPath() %>/cookies?a=delete">쿠키삭제</a>			
			
		</body>
</html>