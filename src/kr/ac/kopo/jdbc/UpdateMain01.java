package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.util.JDBCClose;

public class UpdateMain01 {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = new ConnectionFactory().getConnection();
			conn.setAutoCommit(false);		// commit하는 것을 내가 제어한다.(기본은 autocommit 하게 되있다)
			
			Scanner sc = new Scanner(System.in);
			System.out.print("검색할 ID를 입력하세요 : ");
			String id = sc.nextLine();
			System.out.print("수정할 이름을 입력하세요 : ");
			String name = sc.nextLine();
			
			String sql = "update t_test set name = ? where id = ?";		// 변화가 일어나는 문자열은 String 대신에 StringBulider를 쓴다
			
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,name);
			pstmt.setString(2,id);
			
			int cnt = pstmt.executeUpdate();
			conn.commit();
			
			System.out.println(cnt + "행 수정완료...");
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			JDBCClose.close(pstmt, conn);
		}
	}
}
