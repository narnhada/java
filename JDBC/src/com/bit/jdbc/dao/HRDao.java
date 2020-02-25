package com.bit.jdbc.dao;

import java.util.List;

public interface HRDao {
	// 메서드 설계만 포함
	public List<EmployeeVo> searchEmployee(String keyword);
}
