package Boj;

import java.util.Scanner;

class Small {
	Scanner sc = new Scanner(System.in);
	int getN() {
		int N = sc.nextInt();
		return N;
	}
	int getX() {
		int X = sc.nextInt();
		return X;
	}
	
	void smallnumber(int N, int X) {
		int[] num = new int[N];
		
		for(int i = 0; i < N; i++) {
			num[i] = sc.nextInt();
			
			if(num[i] < X) {
				System.out.printf("%d ", num[i]);
			}
		}
	}
}

public class number10871 {
	public static void main(String[] args) {
		Small sm = new Small();
		
		int N = sm.getN();
		int X = sm.getX();
		
		sm.smallnumber(N, X);
	}
}
