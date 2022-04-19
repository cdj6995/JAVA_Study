package kr.ac.kopo.day06;

import java.util.Scanner;

public class ScannerMain01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 : ");
		
		// nextInt()로 받으면 버퍼가 생기니 이렇게 받는게 좋음 / "123" -> 123 으로 변환
		int num = Integer.parseInt(sc.nextLine());	
		/*
		   int num = sc.nextInt();
		   sc.nextLine();
		 */
	}

}
