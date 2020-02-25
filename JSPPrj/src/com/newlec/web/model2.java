package com.newlec.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/model2")
public class model2 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException {
		int num = 0; 
		String result;
		String num_ = request.getParameter("num");
		if(num_ !=null && !num_.equals(""))
			num = Integer.parseInt(num_);
		
		 if(num%2 != 0) 
			result = "홀수";
		else 
			result = "짝수";
		 
		request.setAttribute("result", result);
		
		String[] names = {"1","2"};
		request.setAttribute("names", names);
		
		Map<String, Object> notice = new HashMap<String, Object>();
		notice.put("id", 911);
		notice.put("id2",119);
		request.setAttribute("notice", notice);
		 
		 // redirect >> model2.java실행 하고 완전히 새로운 요청을 할때 사용
		 // forward >> model2.java를 model2.jsp로 연결해서 사용하겠다
		 
		 RequestDispatcher dispatcher = 
				 request.getRequestDispatcher("model2.jsp");
		 dispatcher.forward(request, response);				// 현재 작업내용이 request, response에  있다면 
		 													// model2.jsp을 실행 하겠다
	}

}
