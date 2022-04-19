package homework.day0314;

import java.util.Arrays;
import java.util.Scanner;

public class Problem01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		int sum = 0;
		
		// 배열에 하나씩 입력받기
		for(int i = 0; i < 5; i++) {
			System.out.printf("%d's num : ", i+1);
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		System.out.println("< PRINT >");
		for(int i = 0; i < 5; i++) {
			System.out.printf("%d ", arr[i]);
		}
		
		System.out.println();
		System.out.printf("총합 : %d", sum);
	}
}
