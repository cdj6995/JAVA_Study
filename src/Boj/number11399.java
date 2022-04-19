package Boj;

import java.util.Arrays;
import java.util.Scanner;

public class number11399 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		int sumMin = 0;
		
		int[] num = new int[n];
		for(int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
		}
		
		Arrays.sort(num);
		
		int loc = 0;
		for(int i = n; i > 0; i--) {
			sumMin += num[loc++] * i;
		}
		
		System.out.println(sumMin);
	}
}
