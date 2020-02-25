package com.newlec.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/notice-reg")
public class noticeReg extends HttpServlet {
	@Override
	public void service(ServletRequest req, 	// 입력 도구
						ServletResponse resp) 	// 출력 도구
					throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8"); // 사용자가 보내는 것이 이렇다 >> 서버가 읽을때
		resp.setContentType("text/html; charset=UTF-8"); // 사용자가 어떻게 사용해야되는지 알려줌 // 서버가 다시 보낼때
		
		//서버에서 입력 받기 전에 한글 설정
		//req.setCharacterEncoding("UTF-8");
		
		PrintWriter out = resp.getWriter();
		
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		
		out.print(title);
		out.print(content);
	}
}
