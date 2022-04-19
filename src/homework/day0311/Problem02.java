package homework.day0311;

import java.util.Scanner;

public class Problem02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1 ~ 100사이의 정수를 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("2 ~ 10사이의 정수를 입력 : ");
		int num2 = sc.nextInt();
		
		
		System.out.println("< 1 ~ 40사이의 5의 배수를 제외한 정수를 출력>");
		for(int i = 1; i <= num1; i++) {
				// 5의 배수를 제외
				if(i % num2 != 0) {
					System.out.print(i + " ");
				}
			}
		System.out.print("\n\n");
		
		System.out.println("<1 ~ 40사이의 5의 배수를 제외한 정수 5개씩 출력>");
		int cnt = 0;
		for(int i = 1; i <= num1; i++) {
			// 5의 배수 제외
			if(i % num2 != 0) {
				cnt++;
				System.out.printf("%2d ", i);
				if(cnt % 5 == 0) {
					System.out.println();
				}
			}
		}
		
		}
	}
