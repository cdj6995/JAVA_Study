package Boj;

import java.util.Scanner;

public class number11050 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int k = sc.nextInt();
		
		int count = k;
		
		int up = 1;
		int down = 1;
		for(int i = 1; i <= count; i++) {
			up *= n--;
			down *= k--;
		}
		
		System.out.println(up/down);
		
	}
}
