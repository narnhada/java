<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- JSTL Core library 사용 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Homepage</title>
</head>
<body>
	
	<!--${list }  -->
  	<!-- 사용자가 Login 한 사용자면: 환영합니다, 로그아웃 페이지 링크 -->
  	<!-- 로그인 안했으면 Login 페이지 링크, 가입페이지 링크 -->
  	<c:choose>
  		<c:when test="${not empty authUser}">
  		<!-- authUser가 null이 아닌 경우-->
		<h3>${authUser.name }님 환영합니다.</h3>  	  
	  
	  	<p><a href="${pageContext.servletContext.contextPath }/users/logout">로그 아웃</a></p> 	
	 
	  	</c:when>
	  	<c:otherwise>
	  	<h3>로그인 안됨</h3>
	  	<p><a href="${pageContext.servletContext.contextPath }/users/login">로그인</a></p>
	  	<p><a href="${pageContext.servletContext.contextPath }/users/join">가입</a></p>
	  	</c:otherwise>
  	
  	
  	</c:choose>  	
  	
	<h1>방명록</h1>
	<form 
			action="${pageContext.servletContext.contextPath }/guestbook/insert" 
			method="POST">
	<table border=1 width=500>
		<tr>
			<td>이름</td><td><input type="text" name="name"></td>
			<td>비밀번호</td><td><input type="password" name="password"></td>
		</tr>
		<tr>
			<td colspan=4><textarea name="content" cols=60 rows=5></textarea></td>
		</tr>
		<tr>
			<td colspan=4 align=right><input type="submit" VALUE=" 확인 "></td>
		</tr>
	</table>
	</form>
	<br/>

	<!-- 게시물 Loop -->
	<c:forEach items="${list }" var="vo">
	<table width=510 border=1>
		<tr>
			<td>[${vo.no }]</td>
			<td>${vo.name }</td>
			<td>${vo.regdate }</td>
			<td>
				<!-- 수정 -->
				<a href="${pageContext.servletContext.contextPath }/guestbook/delete/${vo.no}">
					삭제
				</a>
			</td>
		</tr>
		<tr>
			<td colspan=4>${vo.content}</td>
		</tr>
	</table>
	</c:forEach>
    
</body>
</html>