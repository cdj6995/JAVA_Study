package homework.day0311;

import java.util.Scanner;

public class Problem06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("시작단을 입력 : ");
		int first = sc.nextInt();
		
		System.out.print("종료단을 입력 : ");
		int last = sc.nextInt();
		
		int start = first < last ? first : last;
		int end = first > last ? first : last;
		
		for(int i = start; i <= end; i++) {
			System.out.printf("*** %d단 ***", i);
			System.out.println();
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d", i, j, i*j);
				System.out.println();
			}
		}
		
	}
}
