package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

/*
	아이디 입력 : park
	이름 입력 : 박길동
	1개 행을 삽입하였습니다.
 */
public class InsertMain02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			// 1단계 : 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2단계 : DB 접속 및 Connection 객체 얻기
//			String url = "jdbc:oracle:thin:@192.168.119.119:1521:dink";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String pw = "tiger";
			
			conn = DriverManager.getConnection(url,user,pw);
			
			// 3단계 : sql 실행 객체 얻어오기
			stmt = conn.createStatement();
			
			System.out.print("아이디 입력 : ");
			String id = sc.nextLine();
			System.out.print("이름 입력 : ");
			String name = sc.nextLine();
			
			String sql = "insert into t_test(id,name) values('" +id+"','" +name+"')";
			
			// 4단계 : sql 실행 및 결과 얻어오기
			int cnt = stmt.executeUpdate(sql);
			System.out.println("총 " + cnt + "개 행이 삽입되었습니다.");
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			// 5단계 접속 종료
			if(stmt != null) {
				try {					
					stmt.close();				
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();					
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			sc.close();
		}
	}
}
