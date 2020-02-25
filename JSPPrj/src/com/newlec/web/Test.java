package com.newlec.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/hello")
public class Test extends HttpServlet {
	@Override
	public void service(ServletRequest req, 	// 입력 도구
						ServletResponse resp) 	// 출력 도구
					throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8"); // 사용자가 보내는 것이 이렇다 >> 서버가 읽을때
		resp.setContentType("text/html; charset=UTF-8"); // 사용자가 어떻게 사용해야되는지 알려줌 // 서버가 다시 보낼때

		PrintWriter out = resp.getWriter();

		int cnt = Integer.parseInt(req.getParameter("cnt"));

		for (int i = 0; i < cnt; i++)
			out.println("안녕Servlet<br/>");

	}

}
