package Boj;

import java.util.Scanner;

public class number1225 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String A = sc.next();
		String B = sc.next();
		
		String[] a = A.split("");
		String[] b = B.split("");
		
		int result = 0;
		
		for(String n : a) {
			for(String m : b) {
				result += Integer.parseInt(n) * Integer.parseInt(m);
			}
		}

		System.out.println(result);
		sc.close();
	}
}
