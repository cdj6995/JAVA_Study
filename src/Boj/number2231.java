package Boj;

import java.util.Scanner;

public class number2231 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.nextLine());		// 정수 입력
		int result = 0;
		
		for(int n = 1; n < N; n++) {
			int num = n;
			String number = Integer.toString(n);
			
			for(int j = 0; j < number.length(); j++) {
				num += (number.charAt(j) - '0');
			}
			
			if(num == N) {
				result=1;
				System.out.println(n);
				break;
			}
		}
		
		if(result == 0) {
			System.out.println(0);
		}
		
	}

}
