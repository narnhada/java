<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이메일 리스트: 입력 폼</title>
</head>
	<body>
		<!--  <h1>메일링 리스트 가입</h1>-->
		<!-- 공통 헤더 include -->
		<%-- @ include로 삽입한 파일은 본 파일과 함께 컴파일 --%>
		<%@ include file="/WEB-INF/views/header.jsp" %>
		
		<h3>Model 2</h3>
		
		<form action="<%= request.getContextPath() %>/kim2?a=in"
			method="POST">
			성<input type="text" name="last_name"><br />
			이름<input type="text" name="first_name"><br />
			이메일<input type="text" name="email"><br />
			
			<input type="submit" value="가입">
			<input type="reset" value="새로작성">
			
			<a href="<%= request.getContextPath() %>/">목록 보기</a>		
		</form>
		
	</body>
</html>