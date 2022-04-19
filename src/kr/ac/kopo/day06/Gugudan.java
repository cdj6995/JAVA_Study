package kr.ac.kopo.day06;

import java.util.Scanner;

public class Gugudan {
	// 특정 단의 구구단 출력
	/** 
	 * 파라미터로 날아온 정수의 해단 구구단을 출력
	 * @param dan 출력단
	 */
	void print(int dan) {
		System.out.println("*** " + dan + "단 ***");
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %2d\n", dan, i, dan*i);
		}
	}
	
	// 구구단 전체 출력
	/**
	 * 2 - 9단사이의 구구단 출력
	 */
	void print() {
		print(2, 9);
//		for(int dan = 2; dan < 10; dan++) {
//			print(dan);
//			System.out.println("*** " + dan + "단 ***");
//			for(int j = 1; j < 10; j++) {
//				System.out.printf("%d * %d = %2d\n", dan, j, dan*j);
//			}
//			System.out.println();
//		}
	}
	
	void print3(int dan) {
		for(int st = dan; st < 10; st += 3)
		for(int i = 1; i < 10; i++) {
			for(int j = st; j < st+3; j++) {
				System.out.printf("%d * %d = %d\t", j, i, j*i);
			}
			System.out.println();
		}
	}
	
	// 단 입력받기
	int getDan() {
		Scanner sc = new Scanner(System.in);
		int dan = Integer.parseInt(sc.nextLine());
		return dan;
	}
	
	// 시작부터 종료까지의 구구단 출력
	/** 
	 * 파라미터로 받아온 시작단 ~ 종료단 사이의 구구단 출력
	 * @param start	시작단
	 * @param end	종료단
	 */
	void print(int start, int end) {
		int first = start > end ? end : start;
		int last = start > end ? start : end;
		
		for(int dan = first; dan <= last; dan++) {
			print(dan);
		}
		System.out.println();
	}
}
