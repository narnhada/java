package com.bitacademy.hellospring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitacademy.hellospring.repository.GuestbookDao;
import com.bitacademy.hellospring.repository.GuestbookDaoImpl;
import com.bitacademy.hellospring.repository.GuestbookVo;

@Service
public class GuestbookServiceImpl implements GuestbookService {
	
	@Autowired
	private GuestbookDao guestbookDaoImpl;
	
	@Override
	public List<GuestbookVo> list() {
		List<GuestbookVo> list = guestbookDaoImpl.selectAll();
		System.out.println("게시물 목록:" + list);
		return list;
	}

	@Override
	public boolean insertMessage(GuestbookVo vo) {
		boolean isSuccess = guestbookDaoImpl.insert(vo) == 1;
		System.out.println("insert success? " + isSuccess);
		return isSuccess;
	}

	@Override
	public boolean deleteMessage(GuestbookVo vo) {
		// vo.getNo(), vo.getPassword() >> 오류 검증
		
		boolean isSuccess = guestbookDaoImpl.delete(vo) == 1; // 한개만 지웠다
		// 삭제가 안되었을 때의 처리
		System.out.println("delete success? " + isSuccess);
		return isSuccess;		

	}

}
