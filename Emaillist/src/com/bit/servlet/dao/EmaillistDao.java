package com.bit.servlet.dao;

import java.util.List;

public interface EmaillistDao {
	// 목록용
	public List <EmaillistVo> getEmailList();
	// 삽입용(INSERT용)
	public int insertEmail(EmaillistVo vo);
	
	// TODO: Update, Delete >> 과제임 쫌따 해봐

}
