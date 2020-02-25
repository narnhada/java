package com.bitacademy.hellospring.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	// 파라미터 name은 필수는 아니고, 기본값으로 String 사용 >> 파라미터를 입력 안해도 실행됨
	public ModelAndView hello(@RequestParam(required=false,defaultValue="spring") String name)
	{ 						// @RequestParam 같다 /hello?name=" "
		ModelAndView mav = new ModelAndView();
		mav.addObject("message", "Hello, "+ name);
		mav.setViewName("/WEB-INF/views/hello.jsp");
		mav.setViewName("hello");
		
		return mav;		
		
	}
	
	// 리턴 타입이 String이면 View의 이름을 반환
	@RequestMapping("/hello2")
	public String hello2(@RequestParam(required=false,defaultValue="spring")String name,
			ModelMap map,HttpSession session) 
	{	
		map.addAttribute("message", "Hello, "+ name);
//		return "/WEB-INF/views/hello.jsp";		
		return "hello";
	}
	// 리턴 타입이 String이지만, 해당 값을 직접 응답으로 보내야 할 경우
	// API 등에서 사용되는 XML, JSON 등의 텍스트 데이터 전송할 때
	@ResponseBody
	@RequestMapping("/hello3")
	public String hello3() {
		return "응답 텍스트";		
		
	}
}
