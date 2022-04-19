package kr.ac.kopo.day03.exam;

public class Exam08 {
	public static void main(String[] args) {
		
		//for문 3개
		for(int i = 1; i <= 5; i++) {
			// 공백문자
			for(int j = 1; j <= 5-i; j++) {
				System.out.print(" ");
			}
			// '*' 배열
			for(int k = 1; k <= i ; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println("=====================");
		
		// for문 2개. if문 1개
		for(int i = 5; i >= 1; i--) {
			for(int j = 1; j <=5; j++) {
				if(j < i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
		
	}
}
