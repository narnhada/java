package com.bitacademy.hellospring.repository;

import java.util.List;

public interface GuestbookDao {
	// 모든 게시물 불러오기
	public List<GuestbookVo> selectAll();
	// 게시물 삽입
	public int insert(GuestbookVo vo);
	// 게시물 삭제
	public int delete(GuestbookVo vo);		
	

}
