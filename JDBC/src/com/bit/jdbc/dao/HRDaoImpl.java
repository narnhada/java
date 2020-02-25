package com.bit.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HRDaoImpl implements HRDao {
	public Connection getConnection() {
		Connection conn = null;
		String dburl = "jdbc:mysql://localhost:3306/hr?serverTimezone=UTC&useSSL=false";
		String dbuser = "dev";
		String dbpass = "bit39";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	// 드라이버 로드
			conn = DriverManager.getConnection(dburl, dbuser, dbpass);
			System.out.println("접속 성공!");
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 로드 실패!");
		} catch (SQLException e) {
			System.err.println("SQLError!");
			e.printStackTrace();
		}
		
		return conn;
	}
	
	@Override
	public List<EmployeeVo> searchEmployee(String keyword) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<EmployeeVo> list = new ArrayList<EmployeeVo>();
		String sql = "SELECT employee_id, first_name, last_name, phone_number, hire_date " +
				"FROM employees " +
				"WHERE lower(first_name) LIKE ? OR " +
				"lower(last_name) LIKE ?"; // SQL 실행 계획
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			
			//	파라미터 세팅
			pstmt.setString(1, "%" + keyword + "%");
			pstmt.setString(2, "%" + keyword + "%");
			
			//	쿼리 수행
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				//	레코드 셋을 받아와서
				//	EmployeeVo 객체 생성, 필드 세팅
				// 	리스트에 추가
				Long employeeId = rs.getLong(1);
				String firstName = rs.getString(2);
				String lastName = rs.getString(3);
				String phoneNumber = rs.getString(4);
				String hireDate = rs.getString(5);
				
				EmployeeVo vo = new EmployeeVo();
				vo.setEmployeeId(employeeId);
				vo.setFirstName(firstName);
				vo.setLastName(lastName);
				vo.setPhoneNumber(phoneNumber);
				vo.setHireDate(hireDate);

				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}

}

