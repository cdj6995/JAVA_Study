package homework.day0314;

import java.util.Scanner;

public class Problem05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] nums = {1, 2, 3, 4, 5};
		
		// 부호 입력받기
		System.out.print("Left(-), Right(+) : ");
		String sign = sc.next();
//		char ch = sc.nextLine().charAt(0);
		
		// 시작인덱스 입력받기
		System.out.print("Start Index(0 - 4) : ");
		int id = sc.nextInt();
		
		System.out.println("< PRINT >");
		for(int i = 0; i < 5; i++) {
			
			// 부호가 '+' 일때와 '-' 일때를 구분
//			if(ch == '+')
			if(sign.equals("+")) {				
				System.out.printf("%d ", nums[id]);
				id++;
//				System.out.print(nums[(id+i) % nums.length] + " ");
			} else {
				System.out.printf("%d ", nums[id]);
				id--;
//				System.out.print(nums[(id-i + nums.length) % nums.length] + " ");
			}
			
			// index값이 범위를 넘어갈 경우 index를 재설정
			if(id >=5) {
				id = 0;
			} else if(id < 0){
				id = 4;
			}
		}
		
	}
}
