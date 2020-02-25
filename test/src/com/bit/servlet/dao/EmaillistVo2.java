package com.bit.servlet.dao;

public class EmaillistVo2 {
	private Long No;
	private String firstName;
	private String lastName;
	private String email;
	private String createdAt;
	
	public Long getNo() {
		return No;
	}
	public void setNo(Long no) {
		No = no;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

}
