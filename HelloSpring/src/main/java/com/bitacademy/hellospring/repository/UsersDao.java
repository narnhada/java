package com.bitacademy.hellospring.repository;

public interface UsersDao {
	// 가입을 위한 메서드
	public int insert(UserVo vo);
	// 사용자 정보를 받아오는 메서드 (로그인용: 세션)
	public UserVo getUser(String email, String password);

}
