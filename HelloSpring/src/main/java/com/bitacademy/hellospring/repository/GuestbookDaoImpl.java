package com.bitacademy.hellospring.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository //'여기는 저장소 입니다' 명시 해줌
public class GuestbookDaoImpl implements GuestbookDao {
	@Autowired
	private SqlSession sqlSession; // Bean 자동 연결
	
	@Override
	public List<GuestbookVo> selectAll() {
		List<GuestbookVo> list = 
				sqlSession.selectList("guestbook.selectAll");
		return list;
	}

	@Override
	public int insert(GuestbookVo vo) {
		int insertedCount = 
				sqlSession.insert("guestbook.insert", vo);
		System.out.println("삽입된 레코드:" + insertedCount);
		return insertedCount;
	}

	@Override
	public int delete(GuestbookVo vo) {
		int deletedCount = 
				sqlSession.delete("guestbook.delete", vo);
		System.out.println("삭제된 레코드:" + deletedCount);
		return deletedCount;
	}

}
