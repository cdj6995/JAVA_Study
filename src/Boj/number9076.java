package Boj;

import java.util.Arrays;
import java.util.Scanner;

public class number9076 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			int[] number = new int[5];
			
			for(int j = 0; j < 5; j++) {
				number[j] = sc.nextInt();
			}
			
			Arrays.sort(number);
			
			if(number[3] - number[1] >= 4) {
				System.out.println("KIN");
			}else {
				System.out.println(number[1] + number[2] + number[3]);
			}
			
		}
	}
}
