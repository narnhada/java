package com.bitacademy.hellospring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitacademy.hellospring.repository.UserVo;
import com.bitacademy.hellospring.repository.UsersDao;

@Service
public class UsersServiceImpl implements UsersService {
	@Autowired
	UsersDao usersDaoImpl;
	
	@Override
	public boolean join(UserVo vo) {
		boolean isSuccess = usersDaoImpl.insert(vo) == 1;
		System.out.println("가입 성공?" + isSuccess);
		return isSuccess;
	}

	@Override
	public UserVo getUser(String email, String password) {
		UserVo vo  = usersDaoImpl.getUser(email, password);				
		return vo;
	}

}
