package com.newlec.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/add")
public class Add extends HttpServlet {
	@Override
	public void service(ServletRequest req, 	// 입력 도구
						ServletResponse resp) 	// 출력 도구
					throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8"); // 사용자가 보내는 것이 이렇다 >> 서버가 읽을때
		resp.setContentType("text/html; charset=UTF-8"); // 사용자가 어떻게 사용해야되는지 알려줌 // 서버가 다시 보낼때
		
		//서버에서 입력 받기 전에 한글 설정
		//req.setCharacterEncoding("UTF-8");  filter에서 설정되어있음
		
		PrintWriter out = resp.getWriter();
		
//		int x = Integer.parseInt(req.getParameter("x"));
//		int y = Integer.parseInt(req.getParameter("y"));	
		
		String x_ = req.getParameter("x");
		String y_ = req.getParameter("y");
		
		int x = 0;
		int y = 0;
		
		if(!x_.equals("")) x=Integer.parseInt(x_);
		if(!y_.equals("")) y=Integer.parseInt(y_);
		
		int result = x+y;
		
		//resp.getWriter().printf("result is %d\n", result);
		
		out.printf("result is %d\n", x+y);
		
		
		
		
		

	}
}
