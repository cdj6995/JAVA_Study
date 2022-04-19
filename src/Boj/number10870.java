package Boj;

import java.util.Scanner;

class Fibo{
	Scanner sc = new Scanner(System.in);
	
	int getInt() {
		int n = Integer.parseInt(sc.nextLine());
		return n;
	}
	
	int fibo(int n) {
		if(n == 0 || n == 1) {
			return n;
		} else {
			return fibo(n-1) + fibo(n-2);
		}
	}
}

public class number10870 {

	public static void main(String[] args) {
		Fibo f = new Fibo();
		int n = f.getInt();
		int result = f.fibo(n);
		System.out.println(result);
	}
}
