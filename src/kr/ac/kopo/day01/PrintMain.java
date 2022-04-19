package kr.ac.kopo.day01;

/*
	출력메소드
	1. println() : 개행문자 포함
	2. print() : 개행문자 포함X
	3. printf() : 개행문자 포함X, 문자열만, 출력문자
		출력문자
		  %d : 정수
		  %f : 실수
		  %c : 문자
		  %s : 문자열
		  %b : 논리형
*/

public class PrintMain {

	public static void main(String[] args) {
		System.out.println(10);
		System.out.println(12.34);
		System.out.println('A');
		System.out.println("Hello");
		System.out.println(true);
		
		System.out.print(23);
		System.out.println("살");
		System.out.println(23 + "살");
		
		System.out.printf("%d살 \n", 23);
		System.out.printf("%d살 + %d살 = %d살\n", 10, 20, 10+20);
		
		System.out.printf("[%6d]\n", 1200);
		System.out.printf("[%6d]\n", 950);
		System.out.printf("[%-6d]\n", 1200);
		System.out.printf("[%-6d]\n", 950);
		System.out.printf("[%04d]\n", 25);
		
		System.out.printf("[%f]\n", 12.2456);
		System.out.printf("[%.4f]\n", 12.2456);
		System.out.printf("[%.2f]\n", 12.2456);
		
	}

}
