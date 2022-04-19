package kr.ac.kopo.day11;

import java.io.FileReader;

public class ExceptionMain06 {

	public static void main(String[] args) {
		
		
System.out.println("main start...");
		
		for(int i = 0; i < 5; i++) {
			try {
				System.out.println("loop...");
				if(i == 3) {
					FileReader fr = new FileReader("a.txt");	// checked Exception 컴파일시 에러
				}
			}catch (Exception e) {
				e.printStackTrace();
				break;
			} finally {
				System.out.println("end loop...");		// 자원을 관리한는 목적이면 반드시 finally사용
			}
		}
		System.out.println("main end...");
	}
}
