package homework.day0310;

import java.util.Scanner;

public class problem11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 정수 4개 입력 받기
		System.out.print("정수 4개 입력 : ");
		int one = sc.nextInt();
		int two = sc.nextInt();
		int three = sc.nextInt();
		int four = sc.nextInt();
		
		
		if(one > two && one > three && one > four) {	// 첫번째가 가장 큰 경우
			System.out.print("가장 큰 수 : " + one);
		} else if (two > one && two > three && two > four) {	// 두번째가 가장 큰 경우
			System.out.print("가장 큰 수 : " + two);
		} else if(three > one && three > two && three > four) {		// 세번째가 가장 큰 경우
			System.out.print("가장 큰 수 : " + three);
		} else if(four > one && four > two && four > three) {	// 네번째가 가장 큰 경우
			System.out.print("가장 큰 수 : " + four);
		}
		
		
		// 하나 배웠다!
//		int max = one > two ? one : two;
//		max = max > three ? max : three;
//		max = max > four ? max : four;
//		
//		System.out.println(max);
	}
}
