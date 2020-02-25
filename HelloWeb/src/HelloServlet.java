import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// GET과 POST 전송을 모두 처리
		System.out.println("[Lifecycle] service");
		super.service(arg0, arg1);
	}

	@Override
	public void destroy() {
		// 서버 종료, 혹은 대기 시간이 길 경우, 자원 정리 작업에 사용
		System.out.println("[Lifecycle] destroy");
		super.destroy();
	}

	@Override
	public void init() throws ServletException {
		// 서블릿이 최초 요청을 받았을 떄 초기화 작업 수행
		System.out.println("[Lifecycle] init");
		super.init();
	}

	@Override
	protected void doGet(HttpServletRequest req, 
			HttpServletResponse resp) throws ServletException, IOException {
		
		// 기본적인 응답 정보 출력 ,단순 입력 처리용 >> text/html
		System.out.println("[Lifecycle] doget");
		//resp.setContentType("text/html;charset=UTF-8");
		
		// 파라미터를 전달
		String name = req.getParameter("name");
		if(name == null) {
			name = "Anonymous";			
		}
		
		// 응답 출력
		PrintWriter out = resp.getWriter();
		out.println("<h1>Hello Servlet</h1>");
		out.println("<h3>이것은 Servlet으로 작성되었습니다.</h3>");
		out.println("<p>Hello," + name + "</p>");
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//POST 요청 처리
		System.out.println("[Lifecycle] ");
		//resp.setContentType("text/html;charset = UTF-8");
		
		//요청정보 Encoding
		//req.setCharacterEncoding("UTF-8");
		
		//파라미터 받아오기
		String firstName = req.getParameter("first_name");
		String lastName = req.getParameter("last_name");
		
		//응답 결과 출력
		PrintWriter out = resp.getWriter();
		out.println("<h1>Form Post Data 처리</h1>");
		out.println("<p>first name: "+ firstName +"</p>");
		out.println("<p>last name: "+ lastName +"</p>");		
	}
	

}
