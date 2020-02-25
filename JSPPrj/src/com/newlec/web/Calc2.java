package com.newlec.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/calc2")
public class Calc2 extends HttpServlet {
	@Override
	public void service(ServletRequest req, 	// 입력 도구
						ServletResponse resp) 	// 출력 도구
					throws ServletException, IOException {
		
		
		resp.setCharacterEncoding("UTF-8"); // 사용자가 보내는 것이 이렇다 >> 서버가 읽을때
		resp.setContentType("text/html; charset=UTF-8"); // 사용자가 어떻게 사용해야되는지 알려줌 // 서버가 다시 보낼때
		
		//서버에서 입력 받기 전에 한글 설정
		//req.setCharacterEncoding("UTF-8");  filter에서 설정되어있음
		
		//PrintWriter out = resp.getWriter();
		
		String v_ = req.getParameter("v");		 // cal2에서 받아옴
		String bt = req.getParameter("button");			
		
		int v = 0;  
		if(!v_.equals("")) 
			v = Integer.parseInt(v_); // 입력값이 없을때			
		
		ServletContext apple = req.getServletContext(); // 어플리캐이션  저장소	
		
		//계산		
		if(bt.equals("=")) {
			
			int x = (Integer)apple.getAttribute("value");    // 아래 set에서  값을 받아옴
			int y = v;
			String button = (String)apple.getAttribute("bt");

			int result = 0;
			
			if(button.equals("+"))
			result = x + y;
			else if(button.equals("-"))		
			result = x - y;		
			
			resp.getWriter().printf("result is %d\n", result);	
		}		
		// 값을 저장
		else {			
		apple.setAttribute("value", v); // key, 값  >> cal2에서 받은 값을 
		apple.setAttribute("bt", bt);	// 어플리캐이션 저장소에서  사용하기위한 세팅
		
		
		}		
	}
}
