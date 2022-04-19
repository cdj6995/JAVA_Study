package kr.ac.kopo.day03.exam;

public class Exam11 {
	public static void main(String[] args) {
		
		// for문 2개, if문 2개
		for(int i = 1; i <= 9; i++) {
			int count = i <=5 ? i : 9-i+1;
			
			for(int j = 1; j <= 5; j++) {
				if(j >= count) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("=====================");
		
		// for문 3개, if문 1개
//		for(int i = 1; i <= 9; i++) {
//			if(i <= 5) {
//				for(int j = 1; j <= 5; j++) {
//					if(j >= i) {
//						System.out.print("*");
//					}else {
//						System.out.print(" ");
//					}
//				}
//				System.out.println();
//			}else {
//				for(int j = 5; j <= 9; j++) {
//					if(j >= i) {
//						System.out.print(" ");
//					} else {
//						System.out.print("*");
//					}
//				}
//				System.out.println();
//			}
//		}
	}
}
