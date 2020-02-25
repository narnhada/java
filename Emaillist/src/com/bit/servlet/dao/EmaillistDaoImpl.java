package com.bit.servlet.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmaillistDaoImpl implements EmaillistDao {
	//	커넥션 얻기 공통 코드
	private Connection getConnection() {
		//	Driver 로드
		//	Connection 연결
		//	Connection return
		Connection conn = null;
		String dburl = 
				"jdbc:mysql://localhost:3306/webdb?serverTimezone=UTC&useSSL=false"
				+ "&allowPublicKeyRetrieval=true";
		try {
			//	JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			//	Connection 연결
			conn = DriverManager.getConnection(dburl, "dev", "bit39");
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 로드 실패");
		} catch (SQLException e) {
			System.err.println("DB 접속 실패");
		}
		
		return conn;
	}
	@Override
	public List<EmaillistVo> getEmailList() {
		List<EmaillistVo> list = new ArrayList<>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT no, first_name, last_name, email, created_at FROM emaillist " +
					"ORDER BY created_at DESC";
		
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				Long no = rs.getLong(1);
				String firstName = rs.getString(2);
				String lastName = rs.getString("last_name");
				String email = rs.getString("email");
				String createdAt = rs.getString("created_at");
				
				//	VO 객체 생성
				EmaillistVo vo = new EmaillistVo();
				vo.setNo(no);
				vo.setFirstName(firstName);
				vo.setLastName(lastName);
				vo.setEmail(email);
				vo.setCreatedAt(createdAt);
				//	list에 추가
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int insertEmail(EmaillistVo vo) {
		// INSERT 
		Connection conn = null;
		PreparedStatement pstmt = null;
		int insertedCount = 0;
		String sql = "INSERT INTO emaillist "+
					 "(first_name, last_name,email)"+
					 "VALUES(?,?,?)";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getFirstName());
			pstmt.setString(2, vo.getLastName());
			pstmt.setString(3, vo.getEmail());	
			
			insertedCount = pstmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
				
		
		return insertedCount;
	}

}
