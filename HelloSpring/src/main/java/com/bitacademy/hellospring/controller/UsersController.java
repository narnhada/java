package com.bitacademy.hellospring.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bitacademy.hellospring.repository.UserVo;
import com.bitacademy.hellospring.service.UsersService;
import com.bitacademy.hellospring.service.UsersServiceImpl;

@Controller
@RequestMapping("/users")
public class UsersController {
	@Autowired
	UsersService usersServiceImpl;
	
	@RequestMapping(value="/join", method=RequestMethod.GET)
	public String joinForm() {
		
		return "users/joinform";
		
	}
	
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public String joinAction(@ModelAttribute UserVo vo) {
		// TODO: member 테이블에 UserVo를 INSERT
		// 결과 확인
		// 성공 >> /users/joinsuccess로 리다이렉트
		// 실패 >> /users/join (GET)
		System.out.println("가입폼: " + vo);
		
		boolean isSuccess = usersServiceImpl.join(vo);
		
		if(isSuccess) {
			return "redirect:/users/joinsuccess";			
		}else {
			return "redirect:/users/join";	
		}
			
		
	}
	
	@RequestMapping(value="/joinsuccess", method=RequestMethod.GET)
	public String joinSuccess() {		
		return "users/joinsuccess";
	}
	
	// 로그인
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginForm() {		
		return "users/loginform";
	}
	
	// 로그인 액션
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String loginAction(@RequestParam String email,@RequestParam String password,
		   HttpSession session) {
		System.out.println("FROM-eamil:" + email);
		System.out.println("FROM-password:" + password);
		
		// 사용자 객체를 받아와야 한다
		// 사용자 객체가 not null 이면 httpSession에 등록 >> /guestbook/list 리다이렉트
		// 사용자 객체가 null 이면 login 폼으로 리다이렉트
		UserVo userVo = usersServiceImpl.getUser(email, password);
		if(userVo != null) {
			// 사용자가 DB에 있다
			// 세션에 추가
			session.setAttribute("authUser", userVo);
			// 리스트 페이지로 리다이렉트
			return "redirect:/guestbook/list";			
		}
		return "redirect:/users/login";		
	}
	// 로그 아웃  >> 세션을 삭제한다(무효화)
	@RequestMapping("/logout")
	public String logout(HttpSession session){
		// 세션 무효화
		session.invalidate();
		return "redirect:/guestbook/list";	
		
	}	
	
}
