package com.bit.servlet.dao;

import java.util.List;

public interface EmaillistDao {
	// 목록용
	public List <EmaillistVo> getEmailList();
	// 삽입용(INSERT용)
	public int insertEmail(EmaillistVo vo);	
	// 삭제용(DELETE용)
	public int deleteEmail(EmaillistVo vo);	
	// 수정용(UPDATE용)
	public int updateEmail(EmaillistVo vo);


}
