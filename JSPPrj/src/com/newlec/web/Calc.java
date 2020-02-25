package com.newlec.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/calc")
public class Calc extends HttpServlet {
	@Override
	public void service(ServletRequest req, 	// 입력 도구
						ServletResponse resp) 	// 출력 도구
					throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8"); // 사용자가 보내는 것이 이렇다 >> 서버가 읽을때
		resp.setContentType("text/html; charset=UTF-8"); // 사용자가 어떻게 사용해야되는지 알려줌 // 서버가 다시 보낼때
		
		//서버에서 입력 받기 전에 한글 설정
		//req.setCharacterEncoding("UTF-8");  filter에서 설정되어있음
		
		//PrintWriter out = resp.getWriter();
		
		String x_ = req.getParameter("x");
		String y_ = req.getParameter("y");
		String bt = req.getParameter("button");
	
		
		int x = 0;
		int y = 0;
		
		if(!x_.equals("")) x=Integer.parseInt(x_);
		if(!y_.equals("")) y=Integer.parseInt(y_);
		
		int result = 0;
		
		if(bt.equals("덧셈"))
		result = x+y;
		else if(bt.equals("뺄셈"))		
		result = x-y;
		
		resp.getWriter().printf("result is %d\n", result);	

	}
}
