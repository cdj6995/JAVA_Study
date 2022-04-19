package homework.day0310;

import java.util.Scanner;

public class problem05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("달러를 입력하세요 : ");
		int dollar = sc.nextInt();
		
		System.out.printf("원화 : %.2f원", dollar * 1092.50);
	}
}
