package kr.ac.kopo.day02;

import java.util.Scanner;

/*
 	1 ~ 3사이의 정수 입력 :
 	1입력시 "one" 출력
 	2입력시 "two" 출력
 	3입력시 "three" 출력
 	그 외   "Error" 출력
 	
 	switch => 동등비교의 코드에서 주로 사용
 	  ㄴ default는 case를 모두 수행하고 수행함.
 	  ㄴ 수식에 들어올 수 있는 type => byte, short, char, int, String 만 가능
 	  							/ 실수, 논리형 불가능
 	
 */

public class SwitchMain01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 ~ 3사이의 정수 입력 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("tree");
			break;
		default:
			System.out.println("Error");
		}
		
		sc.close();
	}
}
