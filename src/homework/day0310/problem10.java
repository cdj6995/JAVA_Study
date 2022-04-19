package homework.day0310;

import java.util.Scanner;

public class problem10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		
		System.out.print("세번째 정수 : ");
		int num3 = sc.nextInt();
		
		// num1이 제일 큰 경우
		if(num1 > num2 && num1 > num3) {
			System.out.print(num1+ "  ");
			
			if(num2 > num3) {
				System.out.print(num2 + "  ");
				System.out.print(num3);
			} else {
				System.out.print(num3 + "  ");
				System.out.print(num2);
			}
		} 
		
		
		// num2가 제일 큰 경우
		if(num2 > num1 && num2 > num3) {
			System.out.print(num2+ "  ");
			
			if(num1 > num3) {
				System.out.print(num1 + "  ");
				System.out.print(num3);
			} else {
				System.out.print(num3 + "  ");
				System.out.print(num1);
			}
		}
		
		
		// num3이 제일 큰 경우
		if(num3 > num1 && num3 > num2) {
			System.out.print(num3+ "  ");
			
			if(num1 > num2) {
				System.out.print(num1 + "  ");
				System.out.print(num2);
			} else {
				System.out.print(num2 + "  ");
				System.out.print(num1);
			}
		}
	}
}
