package homework.day0314;

import java.util.Scanner;

public class Problem02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		int sum1 = 0;	// 짝수 총합
		int sum2 = 0;	// 홀수 총합
		
		
		// 배열 입력받기
		for(int i = 0; i < 10; i++) {
			System.out.printf("%d's num : ", i+1);
			arr[i] = sc.nextInt();
		}
		
		System.out.println("< 짝수 >");
		for(int i = 0; i < 10; i++) {
			if(arr[i] % 2 == 0) {
				System.out.printf("%d ", arr[i]);
				sum1 += arr[i];
			}
		}
		System.out.println();
		System.out.printf("짝수의 총합 : %d\n", sum1);
		
		
		System.out.println("< 홀수 >");
		for(int i = 0; i < 10; i++) {
			if(arr[i] % 2 != 0) {
				System.out.printf("%d ", arr[i]);
				sum2 += arr[i];
			}
		}
		System.out.println();
		System.out.printf("홀수의 총합 : %d", sum2);
		
		/*
		 * 강사님 코드
		int[] nums = new int[10];
		int[] sum = new int[2];		// [0]: 짝수 총합 ~ [1]: 홀수 총합
		
		for(int i =0; i < nums.length; i++) {
			System.out.printf("%d's num : ", i+1);
			nums[i] = sc.nextInt();		// 입력받기
			sum[nums[i] % 2] += nums[i];	// 입력받으면서 동시에 짝수 홀수 합 구분
		}
		*/
	}
}
