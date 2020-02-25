import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class EncodingFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(
			ServletRequest req, 
			ServletResponse resp, 
			FilterChain chain)
			throws IOException, ServletException {
		// 요청의 인코딩 변경
		req.setCharacterEncoding("UTF-8");
		// 응답의 컨텐츠 타입 변경
		resp.setContentType("text/html;charset=UTF-8");
		
		chain.doFilter(req, resp); 		// 위 두과정을 처리(필터링)하고 doFilter에 넘겨줌
	}									// 연결된 뒤쪽 필터(서블릿)에 요청과 응답을 전달

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

}
