package homework.day0314;

import java.util.Scanner;

public class Problem03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		/* for문 안에 do-while문만 있을 경우 좋은 코드 X,
		  
		for(int i = 0; i < 5; i++) {	
			// 짝수를 입력받을 때까지 계속 반복
			do {
				System.out.printf("%d's 정수 : ", i+1);
				arr[i] = sc.nextInt();		
			} while(arr[i] % 2 != 0);
		}
		*/
		
		
		int i = 0;
		while(i < arr.length) {
			System.out.printf("%d's 정수 : ", i+1);
			arr[i] = sc.nextInt();
			if(arr[i] % 2 == 0) {
				i++;
			}
		}
		
		
		System.out.println("< 5개의 정수 출력 >");
		for(int j = 0; j < 5; j++) {
			System.out.printf("%d ", arr[j]);
		}
		
	}
}
