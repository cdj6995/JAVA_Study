package homework.day0310;

import java.util.Scanner;

public class problem04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		System.out.print("나눌 수를 입력하세요 : ");
		int div = sc.nextInt();
		
		
		System.out.println("몫 : " + num / div);
		System.out.println("나머지 : " + num % div);
	}
}
