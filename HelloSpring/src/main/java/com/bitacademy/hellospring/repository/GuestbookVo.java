package com.bitacademy.hellospring.repository;

// 데이터 전송용 DTO(VO) 객체
public class GuestbookVo {
	// 필드
	private Long no;
	private String name;
	private String password;
	private String content;
	private String regdate;
	
	// 반드시 기본 생성자가 있어야 한다 
	
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	
	@Override
	public String toString() {
		return "GuestbookVo [no=" + no + ", name=" + name + ", password=" + password + ", content=" + content
				+ ", regdate=" + regdate + "]";
	}		
	

}
