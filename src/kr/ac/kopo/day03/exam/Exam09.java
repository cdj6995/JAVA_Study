package kr.ac.kopo.day03.exam;

public class Exam09 {
	public static void main(String[] args) {
		
		// for문 3개, if문 1개
		for(int i = 1; i <= 9; i++) {
			if(i <= 5) {
				for(int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for(int k = 0; k <= 9-i; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		System.out.println("================");
		
		
		// for문 2개, if문 1개
		for(int i = 1; i <= 9; i++) {
			// 증가, 감소 두 부분으로 나누기
			int count = i <=5 ? i : 9-i+1;
			
			for(int j = 1; j <= count; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
