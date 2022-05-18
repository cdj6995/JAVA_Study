package Boj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class number1003 {
	
	static int fibo(int n) {
		List<Integer> num = new ArrayList();
		num.add(0);
		num.add(1);
		
		if(n == 0 || n == 1) {
			return n;
		}else {
			for(int i = 2; i < n; i++) {
				num.add(num.get(i-1) + num.get(i-2));
			}
			return num.get(n-1);
		}
	}
	
	static void result(int n) {
		if(n == 0) {
			System.out.println(1 + " " + 0);
		}else if(n == 1) {
			System.out.println(0 + " " + 1);
		}else {
			int a = fibo(n);
			int b = fibo(n+1);
			System.out.println(a + " " + b);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < tc; i++) {
			int n = Integer.parseInt(sc.nextLine());
			result(n);
		}
	}
}
