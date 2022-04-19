package Boj;

import java.util.Scanner;

public class number1966 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalcase = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < totalcase; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int cnt = 1;
			int nowrank = 1;
			int rank = 1;
			
			int[] arr = new int[n];
			
			for(int j = 0; j < n; j++) {
				arr[j] = sc.nextInt();
				
			}
			
			for(int j = 0; j < n; j++) {
				if(arr[m] < arr[j])
					rank++;
			}
			
			for(int j = 0; j < n; j++) {
				if(arr[m] < arr[j]) {
					nowrank++;
					cnt++;
				}
				if(nowrank == rank && m < j && arr[m] == arr[j])
					cnt++;
			}
			System.out.println(cnt);
		}
		sc.close();
	}
}
