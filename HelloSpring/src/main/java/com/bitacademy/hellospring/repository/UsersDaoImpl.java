package com.bitacademy.hellospring.repository;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UsersDaoImpl implements UsersDao {
	// SqlSession을 DI
	@Autowired
	SqlSession sqlSession;
	
	@Override
	public int insert(UserVo vo) {
		int insertedCount = sqlSession.insert("users.insert", vo);
		System.out.println("INSERTED Count: " + insertedCount);
		return insertedCount; // == 1 >> 정상적이라면 1 
	}

	@Override
	public UserVo getUser(String email, String password) {
		// users.selectByEmailAndPassword
		// 파라미터 타입으로 map 자료형을 요구
		// HashMap 타입으로 만들어 전달해 줘야 한다
		Map<String, Object> userMap = new HashMap<>();		// Mybatis에 여러객체를 파라미터로 전달하고 싶을때 map 사용
		userMap.put("email", email);
		userMap.put("password", password);
		
		UserVo vo = sqlSession.selectOne("users.selectByEmailAndPassword", userMap);
		System.out.println("UserVo:" + vo);		
		
		return vo;
	}

}
