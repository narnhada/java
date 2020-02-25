package com.bit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import com.bit.jdbc.dao.EmployeeVo;
import com.bit.jdbc.dao.HRDao;
import com.bit.jdbc.dao.HRDaoImpl;

public class JDBCexample {

	public static void main(String[] args) {
//		connectTest();
//		selectTest();
//		searchEmployee();
//		searchEmployeePSTMT();
		searchEmployeeDao();
	}
	//	DAO 활용, 검색 기능 작성
	public static void searchEmployeeDao() {
//		입력 받기
		System.out.print("검색어:");
		Scanner sc = new Scanner(System.in);
		String keyword = sc.next();
		sc.close();
		
		HRDao dao = new HRDaoImpl();
		List<EmployeeVo> list = dao.searchEmployee(keyword);
		
		for (EmployeeVo vo: list) {
			System.out.printf("%d:%s %s: %s, %s%n",
					vo.getEmployeeId(),
					vo.getFirstName(),
					vo.getLastName(),
					vo.getPhoneNumber(),
					vo.getHireDate());
		}
	}
	//	PREPAREDSTATMENT를 이용, 검색 쿼리 작성
	public static void searchEmployeePSTMT() {
		//	입력 받기
		System.out.print("검색어:");
		Scanner sc = new Scanner(System.in);
		String keyword = sc.next();
		sc.close();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = getConnection();
			String sql = "SELECT first_name, last_name, phone_number, hire_date " +
					"FROM employees " +
					"WHERE lower(first_name) LIKE ? OR " +
					"lower(last_name) LIKE ?"; // SQL 실행 계획
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + keyword + "%");
			pstmt.setString(2, "%" + keyword + "%");
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {	// LOOP
				String firstName = rs.getString(1);
				String lastName = rs.getString(2);
				String phoneNumber = rs.getString("phone_number");
				String hireDate = rs.getString("hire_date");
				
				System.out.printf("%s %s: %s, %s%n", firstName,
													lastName,
													phoneNumber,
													hireDate);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//	자원 정리
			try {
				rs.close(); pstmt.close(); conn.close();
			} catch (Exception e) { e.printStackTrace(); }
		}
	}
	
	//	STATEMENT를 이용, 검색 쿼리 작성
	public static void searchEmployee() {
		//	입력 받기
		//	employees의 first_name, last_name 컬럼을 대상으로 LIKE 검색
		//	Projection: first_name, last_name, phone_number, hire_date 
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		Scanner sc = new Scanner(System.in); //	키보드 입력
		System.out.print("검색어 입력:");
		String keyword = sc.next();
		sc.close();
		
		String sql = "SELECT first_name, last_name, phone_number, hire_date " +
				"FROM employees " +
				"WHERE lower(first_name) LIKE '%" + keyword + "%' OR " +
				"lower(last_name) LIKE '%" + keyword + "%'";
		System.out.println("SQL:" + sql);
		
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			// LOOP
			while(rs.next()) {
				String firstName = rs.getString(1);
				String lastName = rs.getString(2);
				String phoneNumber = rs.getString("phone_number");
				String hireDate = rs.getString("hire_date");
				
				System.out.printf("%s %s: %s, %s%n", firstName,
													lastName,
													phoneNumber,
													hireDate);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void selectTest() {
		String sql = "SELECT department_id, department_name FROM departments";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			// 커넥션 얻기
			conn = getConnection();
			//	Statement 만들기
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql); // SELECT -> executeQuery
			
			//System.out.println(rs);
			
			// rs.next() -> 루프
			while(rs.next()) {
				int departmentId = rs.getInt(1); //	컬럼 인덱스 이용 -> 1부터 시작
				String departmentName = rs.getString("department_name");
				
				System.out.printf("%s:%s%n", departmentId, departmentName);
			}
		} catch (SQLException e) {
			System.err.println("SQLError!");
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	//	DB 접속용 메서드 분리
	public static Connection getConnection() {
		Connection conn = null;
		String dburl = "jdbc:mysql://localhost:3306/hr?serverTimezone=UTC&useSSL=false";
		String dbuser = "dev";
		String dbpass = "bitr39";
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
	public static void connectTest() {
		Connection conn = null;
		String dburl = "jdbc:mysql://localhost:3306/hr?serverTimezone=UTC&useSSL=false";
		String dbuser = "dev";
		String dbpass = "bitr39";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	// 드라이버 로드
			conn = DriverManager.getConnection(dburl, dbuser, dbpass);
			System.out.println("접속 성공!");
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 로드 실패!");
		} catch (SQLException e) {
			System.err.println("SQLError!");
			e.printStackTrace();
		} finally {
			// DB 객체 닫기
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
