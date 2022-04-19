package Boj;

import java.util.Scanner;

/*
class Average {
	static Scanner sc = new Scanner(System.in);
	static int totalcase = Integer.parseInt(sc.nextLine());
	
	void average(int totalcase) {
		for(int t = 0; t < totalcase; t++) {
			int tcase = sc.nextInt();
			
			int[] number = new int[tcase];
			int sum = 0;
			int cnt = 0;
			
			for(int i = 0; i < tcase; i++) {
				number[i] = sc.nextInt();
				sum += number[i];
			}
			sc.nextLine();
			int naverage = (sum / tcase);
			
			for(int i =0; i < tcase; i++) {
				if(number[i] > naverage) {
					cnt++;
				}
			}
			
			System.out.printf("%.3f%\n", cnt / tcase);			
		}
	}
}
*/

public class number4344 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int totalcase = Integer.parseInt(sc.nextLine());
		
		for(int t = 0; t < totalcase; t++) {
			
			int tcase = sc.nextInt();
			
			int[] number = new int[tcase];
			int sum = 0;
			int cnt = 0;
			
			for(int i = 0; i < tcase; i++) {
				number[i] = sc.nextInt();
				sum += number[i];
			}
			
			
			int naverage = (sum / tcase);
			
			for(int i = 0; i < tcase; i++) {
				if(number[i] > naverage) {
					++cnt;
				}
			}
			
			double result = ((double)cnt/(double)tcase) * 100;
			
			System.out.printf("%.3f", result);
			System.out.println("%");
		}
		sc.close();
	}
}
