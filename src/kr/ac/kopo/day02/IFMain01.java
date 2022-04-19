package kr.ac.kopo.day02;

/*
 * 조건문
 * 
 * if(조건) {
 * 		문장;
 * }
 * 
 * 
 * 
 * if(조건) {
 * 		문장1;
 * } else {
 * 		문장2;
 * }
 * 
 */

public class IFMain01 {
	
	public static void main(String[] args) {
		
		int book = 10;
		
		System.out.print(book + " book");
		if(book > 1) {
			System.out.println("s");
		}
		System.out.println();
		
		
		if(book >1) {
			System.out.println("books");
		} else {
			System.out.println("book");
		}
			
	}
}
