package com.bit.servlet.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// 서블릿으로 선언
@WebServlet("/cookies")
public class CookieTestServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		// a 파라미터 받아서
		// a가 delete이면 쿠키 삭제, 그렇지 않으면 쿠키 입력 form을 표시
		String action = req.getParameter("a");
		
		if("delete".equals(action)) {
			// 쿠키 삭제
			
			Cookie cookie = new Cookie("example","");
			cookie.setMaxAge(0); // 쿠키 유지시간 0초 >> 무효화
			resp.addCookie(cookie);	// resp객체에 이 메소드를 이용하여 전송한다.
			
			resp.sendRedirect(getServletContext().getContextPath() + "/cookies");
		}else {
			// 요청에 있는 쿠키 정보를 확인
			Cookie[] cookies = req.getCookies();
			if (cookies != null) {
				// 쿠키 목록 중 example 쿠키만 추출
				for(Cookie cookie:cookies) {
					if(cookie.getName().equals("example")) {
						String cookieValue = cookie.getValue();
						// 추출 쿠키를 req에 attribute로 추가
						req.setAttribute("exampleCookie",cookieValue);
						break;						
					}					
				}				
			}
			
			// 쿠키 값 전송 폼으로 FORWORD
			RequestDispatcher rd = getServletContext()
					.getRequestDispatcher("/WEB-INF/views/cookies/form.jsp");
			rd.forward(req, resp);		
			
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		// 클라이언트에서 FORM 전송 받아
		// 쿠키를 세팅
		// 응답 객체에 쿠키 정보를 적재해서 반환
		req.setCharacterEncoding("UTF-8");
		String value = req.getParameter("example");
		
		// 쿠키 객체 만들기
		Cookie cookie = new Cookie("example", value);
		
		// 쿠키 객체를 응답에 적재 한다
		resp.addCookie(cookie);
		
		resp.sendRedirect(getServletContext().getContextPath()+"/cookies");
		
	}
	

}

