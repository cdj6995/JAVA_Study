package kr.ac.kopo.day02;

import java.util.Scanner;

public class OperationMain02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("a 입력 : ");
		int a = sc.nextInt();
		
		System.out.print("b 입력 : ");
		int b = sc.nextInt();
		
		boolean result = (b != 0 && a % b == 0);
		System.out.printf("%d이 %d의 배수인가? %b\n",a, b, result);
		
		sc.close();
	}
}
