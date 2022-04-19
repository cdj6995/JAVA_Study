package homework.day0311;

import java.util.Scanner;

public class Problem04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("2 ~ 9 단을 입력 : ");
		// 단 입력받기
		int dan = sc.nextInt();
		
		System.out.printf("*** %d단 ***\n", dan);
		
		// for문을 통한 구구단 출력
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		}
	}
}
