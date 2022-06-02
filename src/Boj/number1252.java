package Boj;

import java.util.Scanner;

public class number1252 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String N = sc.next();
		String M = sc.next();
		
		int n = to_decimal(N);
		int m = to_decimal(M);
		System.out.println(n);
		System.out.println(m);
		if(n==0 && m == 0) {
			System.out.println(0);
		}else {			
			StringBuilder result = to_binary(n+m);
			System.out.println(result);
		}
	}
	
	public static int to_decimal(String num) {
		String[] number = num.split("");
		int result = 0;
		int cnt = 1;
		
		for(int i = number.length -1; i >= 0; i--) {
			result += Integer.parseInt(number[i]) * cnt;
			cnt *= 2;
		}
		
		return result;
	}
	
	public static StringBuilder to_binary(int num) {
		StringBuilder result = new StringBuilder();
		
		while(num>0) {
			result.append(num % 2);
			num /= 2;
		}
		
		return result.reverse();
	}
}
