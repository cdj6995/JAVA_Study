package kr.ac.kopo.day03.exam;

public class Exam10 {
	public static void main(String[] args) {
		
		// for문 2개, if문 1개
		for(int i = 1; i <= 9; i++) {
			int count = i <= 5 ? i : 9-i+1;
			
			for(int j = count; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("================");
		
		// for문 3개, if문 1개
		
		for(int i = 1; i <= 9; i++) {
			if(i <= 5) {
				for(int j = i; j <= 5; j++) {
					System.out.print("*");
				}
			} else {
				for(int k = i; k >= 5; k--) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
