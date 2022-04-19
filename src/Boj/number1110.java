package Boj;

import java.util.Scanner;

class Cycle {
	static int cnt = 0;
	
	static int plus(int num) {
		int result = num;
		
		do {
			cnt++;
			int num10 = result / 10;
			int num1 = result % 10;
			
			result = num1 * 10 + ( (num10 + num1) % 10 ); 			
		}while(result != num);
		
		return cnt;
	}
}

public class number1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		sc.close();
		
		System.out.println(Cycle.plus(num));
	}
}
