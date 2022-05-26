package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertMain03 {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@192.168.119.119:1521:dink";
			String user = "scott";
			String pw = "tiger";
			
			conn = DriverManager.getConnection(url, user, pw);
			
			String id = "choi";
			String name = "최길동";
			
			String sql = "insert into t_test(id,name) values(?,?)";
			
			pstmt = conn.prepareStatement(sql);		// 알아서 문자열이면 작은 따옴표('')를 붙여준다		
			pstmt.setString(1, id);	// (첫번째자리, 들어갈 문자열)
			pstmt.setString(2, name);
			
			
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행이 삽입되었습니다.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
