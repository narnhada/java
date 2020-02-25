package com.bit.servlet.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.servlet.dao.EmaillistDao2;
import com.bit.servlet.dao.EmaillistDaoImpl2;
import com.bit.servlet.dao.EmaillistVo2;

@WebServlet("/kim") // 제일 중요
public class EmaillistServlet2 extends HttpServlet {
	// Controller의 역할
	// 요청 처리, 로직처리를 JSP 대신 수행
	// 처리 결과를 JSP에게 FORWARD

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 파라미터 a를 받아서
		// a = form 이라면 >> form.jsp로 포워딩
		// 그렇지 않으면 index.jsp로 포워딩

		String action = req.getParameter("a");
//		String b =req.getParameter("b");
		// /kim?a=form >> form2.jsp
		if ("form2".equals(action)) {
			// 요청 Dispatcher
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/views/form2.jsp");
			rd.forward(req, resp);
		} else if ("delete".equals(action)) {

			EmaillistDao2 dao = new EmaillistDaoImpl2();
			EmaillistVo2 vo = new EmaillistVo2();
			// vo.setEmail(req.getParameter("email")); //지금 같은 이메일을 다 지워 버린다 >> no값 매칭해서 해결
//				vo.setLastName(req.getParameter("last_name"));
//				vo.setEmail(req.getParameter("email"));
			vo.setNo(Long.parseLong(req.getParameter("no")));

			int a = dao.deleteEmail(vo);

			resp.sendRedirect(req.getContextPath() + "/kim");
		} else if ("update".equals(action)) {
			System.out.println("1up");
//			if (b.equals("y")) {
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/views/form3.jsp");
			rd.forward(req, resp);

		} else if ("updates".equals(action)) {
			System.out.println("updas");
			EmaillistDao2 dao = new EmaillistDaoImpl2();
			EmaillistVo2 vo = new EmaillistVo2();
			vo.setFirstName(req.getParameter("first_name"));
			vo.setLastName(req.getParameter("last_name"));
			vo.setEmail(req.getParameter("email"));
			vo.setNo(Long.parseLong(req.getParameter("no")));

			int a = dao.updateEmail(vo);
			System.out.println(a);
			resp.sendRedirect(req.getContextPath() + "/kim");
//			}

		} else {
			// /kim
			EmaillistDao2 dao = new EmaillistDaoImpl2();
			List<EmaillistVo2> list = dao.getEmailList();

			// 생성된 객체를 req 추가(Attribute)
			req.setAttribute("list", list);

			RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/views/index2.jsp");
			rd.forward(req, resp);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 요청 캐릭터셋을 UTF-8로 변경
		// TODO: EncodingFilter >> 집어넣어 보기
		req.setCharacterEncoding("UTF-8");

		// 파라미터 받아오기
		String firstName = req.getParameter("first_name");
		String lastName = req.getParameter("last_name");
		String email = req.getParameter("email");

		EmaillistVo2 vo = new EmaillistVo2();
		vo.setFirstName(firstName);
		vo.setLastName(lastName);
		vo.setEmail(email);

		EmaillistDao2 dao = new EmaillistDaoImpl2();
		int insertedCount = dao.insertEmail(vo);

		// System.out.println("inserted Count: " + insertedCount);

		resp.sendRedirect(req.getContextPath() + "/kim");

	}

}
