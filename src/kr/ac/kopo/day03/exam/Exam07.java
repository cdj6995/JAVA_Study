package kr.ac.kopo.day03.exam;

public class Exam07 {
	public static void main(String[] args) {
		// for문 3개
		for(int i = 1; i <= 5; i++) {
			// 앞에 공백문자
			for(int j = 0; j <= i-2; j++) {
				System.out.print(" ");
			}
			// '*'문자 정렬
			for(int k = i; k <= 5; k++) {
				System.out.print("*");
			}
			// enter
			System.out.println();
		}
		
		System.out.println("============");
		
		// for문 2개, if문 1개
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				if(j >= i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
