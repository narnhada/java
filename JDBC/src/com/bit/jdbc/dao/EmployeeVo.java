package com.bit.jdbc.dao;

//	DTO(VO): 데이터 전송용 순수 자바 객체
public class EmployeeVo {
	//	특정 로직은 갖지 않는다
	//	필드는 private으로 보호한다
	//	필드에 접근은 getter, setter로 한다
	//	반드시 기본생성자가 있어야 한다
	// 필드
	private Long employeeId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String hireDate;
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
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
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	@Override
	public String toString() {
		return "EmployeeVo [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", phoneNumber=" + phoneNumber + ", hireDate=" + hireDate + "]";
	}
	
	

}
