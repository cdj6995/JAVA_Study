package Boj;

import java.util.Scanner;

public class number2231 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		int result = 0;
		
		for(int n = 1; n < N; n++) {
			int num = n;
			String number = Integer.toString(n);
			
			for(int j = 0; j < number.length(); j++) {
				num += (int)(number.charAt(j));
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
