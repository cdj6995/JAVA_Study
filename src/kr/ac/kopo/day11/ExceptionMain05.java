package kr.ac.kopo.day11;

import java.util.Random;

public class ExceptionMain05 {

	public static void main(String[] args) {
		
		System.out.println("main start...");
		Random r = new Random();
		
		try {
			int num = r.nextInt(3);	// 0, 1, 2
			System.out.println("num : " + num);
			System.out.println(10 / num);
						
			String str = "hello";
			System.out.println("str : " + str);
			System.out.println(str.charAt(10));
		} catch(Exception e) {
			System.out.println("예외처리 : " + e.getMessage());
//			ae.printStackTrace();
		}
		System.out.println("main end...");
	}
}
