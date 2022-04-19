package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain02 {
	public static void main(String[] args) {
		
//		String[] strarr = {"데이터분석", "자바", "교육"};
		String[] strarr = new String[5];
		
		int loc = 0;
		strarr[loc++] = "폴리텍";
		strarr[loc++] = "데이터분석";
		strarr[loc++] = "자바";
		strarr[loc++] = "교육";
		
		System.out.println("문자열의 총 개수 : " + strarr.length);
		
		/*
		 	배열의 전체 원소를 출력 방식
		 	1. index를 이용한 출력 (원소접근 : 0 ~ length-1)
		 	2. 1.5버전의 for문을 이용한 출력
		 	3. Arrays.toString() 메소드를 이용한 출력
		 */
		
		System.out.println("< index를 이용한 출력 >");
		for(int i = 0; i < strarr.length; i++) {
			System.out.println(strarr[i]);
		}
		
		System.out.println("< 1.5버전의 for문 이용 출력 >");
		for(String e : strarr) {
			System.out.println(e);
		}
		
		System.out.println("< Arrays.toString() 메소드 이용 출력 >");
		String result = Arrays.toString(strarr);	// "[원소, 원소, 원소, ...]"
		System.out.println(result);
	}
}
