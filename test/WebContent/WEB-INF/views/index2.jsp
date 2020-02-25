<%@page import="com.bit.servlet.dao.EmaillistVo2"%>
<%@page import="java.util.List"%>
<%@page import="com.bit.servlet.dao.EmaillistDaoImpl2"%>
<%@page import="com.bit.servlet.dao.EmaillistDao2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% // DAO 불러오기
/* >> Controller로 이동
EmaillistDao dao = new EmaillistDaoImpl();
List<EmaillistVo> list = dao.getEmailList();
*/ // 모델 2에서는 여기서 안함 

List<EmaillistVo2> list = (List<EmaillistVo2>)request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메일링 리스트:목록</title>
</head>
	<body>
	
		<h1>메일링 리스트</h1>
		<h3>Model 2</h3>
		<!-- 테이블로 메일링 리스트 출력 -->
		<%
		for (EmaillistVo2 vo: list) {
		%>
		<table border="1">
			<!-- 행 -->
			<tr>
				<td>번호</td>
				<td><%= vo.getNo() %></td>
			</tr>
			<tr>
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
			<tr>
				<td>이메일 삭제</td>
				<!-- <td><a href="<%= request.getContextPath() %>/kim?a=delete&email=<%= vo.getEmail() %>">이메일 삭제</a></td>   -->
				<td><a href="<%= request.getContextPath() %>/kim?a=delete&no=<%= vo.getNo() %>">이메일 삭제</a></td>
				
			</tr>
			<tr>
				<td>이메일 수정</td>
				<td><a href="<%= request.getContextPath() %>/kim?a=update&no=<%= vo.getNo() %>">이메일 수정</a></td>
				
			</tr>
			
		</table>
		<% } %>
		<!-- 입력 폼으로 링크: 모델2 -->
	  	<a href="<%= request.getContextPath() %>/kim?a=form2">이메일 등록</a>
		
	</body>
</html>