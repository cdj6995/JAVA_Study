package homework.day0310;

import java.util.Scanner;

public class problem03 {
	public static void main(String[] args) {
		
		// 반지름 입력받기
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		
		double result = r * r  * 3.14192;
				
		System.out.printf("결과출력 : 원의 면적은 %.4f 입니다.", result);
	}
}
