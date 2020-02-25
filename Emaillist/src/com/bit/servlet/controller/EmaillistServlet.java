package com.bit.servlet.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.servlet.dao.EmaillistDao;
import com.bit.servlet.dao.EmaillistDaoImpl;
import com.bit.servlet.dao.EmaillistVo;

@WebServlet("/el")
public class EmaillistServlet extends HttpServlet {
	// Controller의 역할
	// 요청 처리, 로직처리를 JSP 대신 수행
	// 처리 결과를 JSP에게 FORWARD

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		// 파라미터 a를 받아서
		// a = form 이라면 >> form.jsp로 포워딩
		// 그렇지 않으면 index.jsp로 포워딩
		
		String action = req.getParameter("a");
		// /el?a=form >> form.jsp
		if("form".equals(action)) {
			// 요청 Dispatcher
			RequestDispatcher rd = getServletContext()
					.getRequestDispatcher("/WEB-INF/views/form.jsp");
			rd.forward(req, resp);			
		} else {
			// /el
			EmaillistDao dao = new EmaillistDaoImpl();
			List<EmaillistVo> list = dao.getEmailList();
			
			// 생성된 객체를 req 추가(Attribute)
			req.setAttribute("list", list);
			
			RequestDispatcher rd = getServletContext()
					.getRequestDispatcher("/WEB-INF/views/index.jsp");	
			rd.forward(req, resp);	
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		// 요청 캐릭터셋을 UTF-8로 변경
		// TODO: EncodingFilter >> 집어넣어 보기
		req.setCharacterEncoding("UTF-8");
		
		// 파라미터 받아오기
		String firstName = req.getParameter("first_name");
		String lastName = req.getParameter("last_name");
		String email = req.getParameter("email");
		
		EmaillistVo vo = new EmaillistVo();
		vo.setFirstName(firstName);
		vo.setLastName(lastName);
		vo.setEmail(email);
		
		EmaillistDao dao = new EmaillistDaoImpl();
		int insertedCount = dao.insertEmail(vo);
		
		System.out.println("inserted Count: " + insertedCount);
		
		resp.sendRedirect(req.getContextPath() + "/el");
		
	}


}
