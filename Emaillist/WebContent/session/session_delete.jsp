<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page session="true"%> <!-- JSP에서 세션 사용 -->
<%
// 세션 삭제 >> 개별 Attribute의 삭제
session.removeAttribute("userId");
session.removeAttribute("name");

// 세션 무효화 >> 전체 삭제
session.invalidate();
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션 삭제</title>

</head>
<body>
	<h1>세션 삭제</h1>
	<a href="session_read.jsp">세션 변수 확인</a>
</body>
</html>