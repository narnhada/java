package com.newlec.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculator")
public class Calculator extends HttpServlet{
	
	@Override // 
	protected void service(HttpServletRequest req, 			//여기는 서비스를 실행하고 get,post메서드를 실행시키고, 
						   HttpServletResponse resp) 		//아래는 서비스 실행 시키지 않고 바로 클라이언트가 서비스 호출
					throws ServletException, IOException {
		
		if(req.getMethod().equals("GET")){
			System.out.println("GET왔쩡");
			
		}else if(req.getMethod().equals("POST")){
			System.out.println("POST왔쩡");			
		}
		
		super.service(req, resp); // 아래로 넘어감  아래는 부모 서비스에서 실행
	}
	
	@Override // html 창에서 직접 post메서드를 호출함
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		System.out.println("doPOST왔쩡");		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		System.out.println("doGET왔쩡");	
	}
	

}
