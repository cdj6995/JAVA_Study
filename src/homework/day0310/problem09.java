package homework.day0310;

import java.util.Scanner;

public class problem09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 첫번째 경우
		System.out.printf("보유하고 있는 책권수 : ");
		int one = sc.nextInt();
		
		if(one < 0) {
			System.out.println("잘못입력했습니다");
		} else if(one == 0) {
			System.out.println("보유하고 있는 책 없음");
		} else if(one == 1) {
			System.out.println(one + " book");
		} else {
			System.out.println(one + " books");
		}
		System.out.println();
		
		// 두번째 경우
		System.out.printf("보유하고 있는 책권수 : ");
		int two = sc.nextInt();
		
		if(two < 0) {
			System.out.println("잘못입력했습니다");
		} else if(two == 0) {
			System.out.println("보유하고 있는 책 없음");
		} else if(two == 1) {
			System.out.println(two + " book");
		} else {
			System.out.println(two + " books");
		}
		System.out.println();
		
		// 세번째 경우
		System.out.printf("보유하고 있는 책권수 : ");
		int three = sc.nextInt();
		
		if(three < 0) {
			System.out.println("잘못입력했습니다");
		} else if(three == 0) {
			System.out.println("보유하고 있는 책 없음");
		} else if(three == 1) {
			System.out.println(three + " book");
		} else {
			System.out.println(three + " books");
		}
		System.out.println();
		
		// 네번째 경우
		System.out.printf("보유하고 있는 책권수 : ");
		int four = sc.nextInt();
		
		if(four < 0) {
			System.out.println("잘못입력했습니다");
		} else if(four == 0) {
			System.out.println("보유하고 있는 책 없음");
		} else if(four == 1) {
			System.out.println(four + " book");
		} else {
			System.out.println(four + " books");
		}
	}
}
