<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이메일 리스트: 입력 폼</title>
</head>
	<body>
		<h1>메일링 리스트 up</h1>
		<h3>Model 2</h3>
		
		<form action="<%= request.getContextPath() %>/kim?a=updates"
			method="GET">  
			
			<input type="hidden" name="a" value="updates"/>
			
			<input type="hidden" name="no" value="<%= request.getParameter("no")%>"/>
			성<input type="text" name="last_name"><br />
			이름<input type="text" name="first_name"><br />
			이메일<input type="text" name="email"><br />
			
			<input type="submit" value="수정">
			<input type="reset" value="다시작성">
			
			<a href="<%= request.getContextPath() %>/">목록 보기</a>		
		</form>
		
	</body>
</html>