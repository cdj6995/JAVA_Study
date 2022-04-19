package homework.day0318;

import java.util.Scanner;

class Calculator {
	Scanner sc = new Scanner(System.in);
	
	// 정수 입력받기
	int getInt() {
		int n = Integer.parseInt(sc.nextLine());
		return n;
	}
	
	// 덧셈
	void plus(int a, int b) {
		System.out.printf("%d + %d = %d\n", a, b, a+b);
	}
	// 뺄셈
	void minus(int a, int b) {
		System.out.printf("%d - %d = %d\n", a, b, a-b);
	}
	// 곱셈
	void prod(int a, int b) {
		System.out.printf("%d * %d = %d\n", a, b, a*b);
	}
	// 나눗셈
	void divi(int a, int b) {
		System.out.printf("%d / %d = %.1f\n", a, b, (double)a/(double)b);
	}
	
	// 소수체크
	void check(int n) {
		int result = 0;
		
		for(int i = 2; i < n; i++) {
			result = n % i == 0? 1 : -1;
			if(result == 1) break;
			
		}
		
		if(result == -1)
			System.out.println(n + " 소수체크 : " + true);
		else
			System.out.println(n + " 소수체크 : " + false);
	}
}


public class Problem08 {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		System.out.print("정수 : ");
		int a = cal.getInt();
		
		System.out.print("정수 : ");
		int b = cal.getInt();
		
		cal.plus(a, b);
		cal.minus(a, b);
		cal.prod(a, b);
		cal.divi(a, b);
		
		cal.check(a);
		cal.check(b);
		
	}
}
