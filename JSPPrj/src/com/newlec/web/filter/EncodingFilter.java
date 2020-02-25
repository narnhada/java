package com.newlec.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*")
public class EncodingFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request,
			ServletResponse response, 
			FilterChain chain)  
			throws IOException, ServletException {
		
		request.setCharacterEncoding("UTF-8");
		
		System.out.println("before filter");// 필터가 실행 전 
		chain.doFilter(request, response);
		System.out.println("after filter"); // 이요청을 서블릿에서 처리 하느냐는 chain이 정함
											// 필터가 실행 된후 

	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

}
