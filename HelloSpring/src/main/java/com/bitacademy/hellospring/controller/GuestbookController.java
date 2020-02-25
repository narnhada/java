package com.bitacademy.hellospring.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.ContextLoader;

import com.bitacademy.hellospring.repository.GuestbookVo;
import com.bitacademy.hellospring.service.GuestbookService;
import com.bitacademy.hellospring.service.GuestbookServiceImpl;

@Controller
@RequestMapping("/guestbook")
public class GuestbookController {
	
	@Autowired
	private GuestbookService guestbookServiceImpl;
	
	@RequestMapping({"/", "/list"})	//	여러 개의 URL 매핑
	public String list(Model model) {
/*		//	Ver1. DAO
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		//	결과 객체를 View에 반영하기 위한 리스트
		List<GuestbookVo> list = new ArrayList<>();
		
		try {
			//	ApplicationContext로부터 dataSource 얻어와야 함
			ApplicationContext ctx = 
				ContextLoader.getCurrentWebApplicationContext();
			DataSource ds = (DataSource)ctx.getBean("dataSource");
			conn = ds.getConnection();
			
			String sql = "SELECT no, name, password, content, regdate " +
					"FROM guestbook ORDER BY regdate DESC";
			System.out.println("SQL:" + sql);
			
			stmt = conn.createStatement();
			
			// 쿼리 수행
			rs = stmt.executeQuery(sql);
			
			//	루프 -> List 생성
			while(rs.next()) {
				Long no = rs.getLong(1);
				String name = rs.getString(2);
				String password = rs.getString(3);
				String content = rs.getString(4);
				String regdate = rs.getString(5);
				
				GuestbookVo vo = new GuestbookVo();
				vo.setNo(no);
				vo.setName(name);
				vo.setPassword(password);
				vo.setContent(content);
				vo.setRegdate(regdate);
				
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		model.addAttribute("list", list);
		System.out.println("방명록:" + list);
*/		
		// Ver2. MyBatis
		List<GuestbookVo> list = guestbookServiceImpl.list();
		model.addAttribute("list", list);
		System.out.println("방명록:" + list);		
		
		return "guestbook/list";

	}
	// 게시물 작성: POST 방식으로 FORM 전송
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public String insert(@ModelAttribute GuestbookVo vo) {
		// 각 파라미터를 개별적으로 불러오는 것이 아니라
		// Vo 객체의 필드 명에 매칭되는 input 데이터를 자동으로 매핑
		System.out.println("FORM 전송 내용:" + vo);
		// Service의 insert 호출
		guestbookServiceImpl.insertMessage(vo);
		// 리다이렉트
		return "redirect:/guestbook/list";
		
	}
	
	// 게시물 삭제를 위한 암호 입력 폼으로 연결
	// {no} >> PathVariable: url 문자열에 함께 실려온 파라미터
	@RequestMapping(value="/delete/{no}", method=RequestMethod.GET)
	public String delete(@PathVariable("no") Long no, Model model) {
		model.addAttribute("no", no); // > 삭제할 게시물의 no를 form에 세팅
		return "guestbook/deleteform";
		
	}	
	
	// 게시물 삭제(POST 폼 전송)
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public String delete(@ModelAttribute GuestbookVo vo) {
		// 삭제 처리 >> Service로 
		System.out.println("삭제 FORM:" + vo);
		boolean isSuccess = guestbookServiceImpl.deleteMessage(vo);
		
		if(isSuccess) {
			System.out.println("정상적으로 삭제 되었습니다.");			
		}else {
			System.out.println("정상적으로 삭제 되지 않았습니다.");			
		}
		return "redirect:/guestbook/list";		
		
	}
	
	// JSON API를 위한 메시지 컨버팅
	@ResponseBody			//해당 요청에 다한 응답?
	@RequestMapping("/api/list")
	public Object jsonList() {
		// 리스트를 받아와서 Map에 추가
		List<GuestbookVo> list = guestbookServiceImpl.list();
		Map<String, Object> jsonMap = new HashMap<>(); //  >> json으로 컨버팅
		jsonMap.put("result", "success");
		jsonMap.put("list", list);
		
		return jsonMap;	
		
	}
	
}
	
	

