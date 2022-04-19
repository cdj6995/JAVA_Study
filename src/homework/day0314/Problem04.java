package homework.day0314;

import java.util.Scanner;

public class Problem04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		// 처음 인덱스값은 비교X => 그냥 입력받기
		System.out.print("1번째 정수 : ");
		arr[0] = sc.nextInt();
		
		// 두번째 인덱스부터 앞의 인덱스와 비교
		for(int i = 1; i < 5; i++) {
			int cnt = 1;
			do {
				// 2번 이상 입력받을 경우
				if(cnt > 1) {
					// i번째 전까지의 모든 숫자 출력
					for(int j = 1; j <= i; j++) {
						// 마지막은 ',' 빼기
						if(j == i)
							System.out.printf("%d", arr[j-1]);
						else
							System.out.printf("%d, ", arr[j-1]);
					}
					System.out.print("보다 큰수가 와야합니다\n");
				}
				
				System.out.printf("%d번째 정수 : ", i+1);
				arr[i] = sc.nextInt();
				cnt++;	// 횟수를 세기 위해
			} while(arr[i] <= arr[i-1]);
		}
		
		/*
		 * 강사님 코드
		String msg = "";
		for(int i = 0; i < arr.length;) {
			System.out.printf("%d번째 정수 : ", i+1);
			arr[i] = sc.nextInt();
			if(i > 0 && arr[i] < arr[i-1]) {
				System.out.println(msg + "보다 큰수여야합니다");
			} else {
				msg += arr[i++] + " ";
			}
		}
		 */
		
		
		
		System.out.println("< PRINT >");
		for(int i = 0; i < 5; i++) {
			System.out.printf("%d ", arr[i]);
		}
		
		System.out.println();
		
		System.out.println("< REVERSE >");
		for(int i = 4; i >= 0; i--) {
			// 역순의 숫자 설정
			int reverse = 0;
			// 10으로 나누면서 역순의 숫자 설정
			while(arr[i] != 0) {
				reverse = reverse * 10 + arr[i] % 10;
				arr[i] /= 10;
			}
			System.out.printf("%d ", reverse);
		}
	}
}
