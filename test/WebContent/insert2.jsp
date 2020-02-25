<%@page import="com.bit.servlet.dao.EmaillistVo2"%>
<%@page import="com.bit.servlet.dao.EmaillistDaoImpl2"%>
<%@page import="com.bit.servlet.dao.EmaillistDao2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 저장 로직 --%>
<%
request.setCharacterEncoding("UTF-8");
EmaillistDao2 dao = new EmaillistDaoImpl2();
if (request.getMethod() == "GET") {
	%>
	<p>GET 메서드로는 처리할 수 없음</p>
	<%
} else {
	//	POST 처리부
	String firstName = 
		request.getParameter("first_name");
	String lastName = 
		request.getParameter("last_name");
	String email =
		request.getParameter("email");
	
	EmaillistVo2 vo = new EmaillistVo2();
	vo.setFirstName(firstName);
	vo.setLastName(lastName);
	vo.setEmail(email);
	
	//	insert
	int insertedCount = dao.insertEmail(vo);
	//	TODO: insertedCount == 1
			
	//	완료 되었으니 새 페이지로 리다이렉트
	response.sendRedirect(request.getContextPath());
	
}
%>