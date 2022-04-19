package Boj;

import java.util.Scanner;

class Reverse {
	
	static int reverse(int num){
		int result = 0;
		while(num > 0) {
			result = result * 10 + num % 10;
			num /= 10;
		}
		return result;
	}
}

public class number2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		sc.close();
		
		int areverse = Reverse.reverse(a);
		int breverse = Reverse.reverse(b);
		
		int result = areverse > breverse ? areverse : breverse;
		
		System.out.println(result);
	}
}
