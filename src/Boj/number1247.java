package Boj;

import java.util.Scanner;

public class number1247 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			long N = Long.parseLong(sc.nextLine());
			
			String result = sign(N);
			System.out.println(result);			
		}
	}
	
	public static String sign(long N) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		
		for(int i = 0; i < N; i++) {
			long num = Long.parseLong(sc.nextLine());
			result += num;
		}
		
		if(result == 0) {
			return "0";
		}else if(result > 0) {
			return "+";
		}else {
			return "-";
		}
	}
}
