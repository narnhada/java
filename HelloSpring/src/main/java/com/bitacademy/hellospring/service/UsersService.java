package com.bitacademy.hellospring.service;

import org.springframework.stereotype.Service;

import com.bitacademy.hellospring.repository.UserVo;


public interface UsersService {
	// 가입 메서드
	public boolean join(UserVo vo);
	// 사용자 정보 가져오기
	public UserVo getUser(String email, String password);

}
