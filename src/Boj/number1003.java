package Boj;

import java.util.Scanner;

public class number1003 {
	
	static int fibo(int n) {
		if(n == 0 || n == 1) {
			return n;
		}else {
			return fibo(n-1) + fibo(n-2);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < tc; i++) {
			int n = Integer.parseInt(sc.nextLine());
			
		}
	}
}
