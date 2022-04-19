package Boj;

import java.util.Arrays;
import java.util.Scanner;


public class number2750 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] number = new int[N];
		
		for(int i = 0; i < N; i++) {
			number[i] = sc.nextInt();
		}
		
		Arrays.sort(number);
		
		for(int i = 0; i < N; i++) {
			System.out.println(number[i]);
		}
	}
}