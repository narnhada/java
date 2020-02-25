package com.bit.servlet.dao;

import java.util.List;

public interface EmaillistDao2 {
	public List <EmaillistVo2> getEmailList();
	// 삽입용(INSERT용)
	public int insertEmail(EmaillistVo2 vo);
	// 삭제용(DELETE용)
	public int deleteEmail(EmaillistVo2 vo);
	// 수정용(UPDATE용)
	public int updateEmail(EmaillistVo2 vo);
	// EmaillistVo2의 객체
	public EmaillistVo2 getEmaillistByNo(long no);
	

}
