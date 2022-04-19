package kr.ac.kopo.day11;

import java.util.Scanner;

// 나만의 예외클래스
class MismatchEvenException extends Exception {

	public MismatchEvenException() {
		super();
	}

	public MismatchEvenException(String message) {
		super(message);
	}
}


public class ExceptionMain08 {

	public static void main(String[] args) /*throws Exception*/ {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("짝수를 입력 : ");
		int num = sc.nextInt();
		
		try {
			if(num < 0 || num % 2 == 1) {
				throw new MismatchEvenException(num + "은 짝수가 아닌 정수입니다.");
			} else {
				System.out.println("짝수 : " + num);
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("짝수를 입력 : ");
		int num = sc.nextInt();
		
		if(num < 0 || num % 2 == 1) {
			System.out.println("잘못입력");
		} else {
			System.out.println("짝수 : " + num);
		}
		*/
		
	}
}
