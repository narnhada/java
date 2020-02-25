<%@page import="com.bit.servlet.dao.EmaillistVo2"%>
<%@page import="java.util.List"%>
<%@page import="com.bit.servlet.dao.EmaillistDaoImpl2"%>
<%@page import="com.bit.servlet.dao.EmaillistDao2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% // DAO 불러오기
EmaillistDao2 dao = new EmaillistDaoImpl2();
List<EmaillistVo2> list = dao.getEmailList();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메일링 리스트:목록</title>
</head>
	<body>
	
		<h1>메일링 리스트</h1>
		<h3>Model 1</h3>
		<!-- 테이블로 메일링 리스트 출력 -->
		<%
		for (EmaillistVo2 vo: list) {
		%>
		<table border="1">
			<tr><!-- 행 -->
				<td>성</td>
				<td><%= vo.getLastName() %>  </td>
			</tr>
			<tr>
				<td>이름</td>
				<td><%= vo.getFirstName() %></td>
			</tr>
			<tr>
				<td>이메일</td>
				<td><%= vo.getEmail() %></td>
			</tr>

		</table>
		<% } %>
		<!-- 입력 폼으로 링크 -->
		<a href="<%= request.getContextPath() %>/form2.jsp">이메일 등록</a>
		
	
	</body>
</html>