package Boj;

import java.util.Scanner;

public class number1085 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = Integer.parseInt(sc.next());
		int y = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		int h = Integer.parseInt(sc.next());
		
		int min = Math.min(x, y);
		min = Math.min(min, Math.abs(x-w));
		min = Math.min(min, Math.abs(y-h));
		
		System.out.println(min);
		
	}
}
