package com.bitacademy.hellospring.service;

import java.util.List;

import com.bitacademy.hellospring.repository.GuestbookVo;

// 3Tier : Controller - Service - Repository 

public interface GuestbookService {
	// 게시판 리스트 로직
	public List<GuestbookVo> list();
	// 게시판 삽입 로직
	public boolean insertMessage(GuestbookVo vo);
	// 게시판 삭제 로직
	public boolean deleteMessage(GuestbookVo vo);
}
