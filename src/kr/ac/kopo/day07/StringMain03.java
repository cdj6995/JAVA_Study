package kr.ac.kopo.day07;

import java.util.Arrays;

public class StringMain03 {

	public static void main(String[] args) {
		
		String str = "hello world!";
		
//		char search = 'r';
//		String search = "llo";
		String search = "l";
		System.out.println(str.indexOf(search));	// 맨앞에서부터 찾기 시작(문자, 문자열 둘 다 가능)해서 인덱스 반환, 없으면 -1 반환
		System.out.println(str.indexOf(search, 5));	// 5번째 부터 찾기 시작(문자, 문자열 둘 다 가능)해서 인덱스 반환
		
		System.out.println("< " + search + "위치 index 검색 >");
		int index = str.indexOf(search);
		while(index != -1) {
			System.out.println("인덱스 : " + index);
			index = str.indexOf(search, ++index);
		}
		
		System.out.println(str.lastIndexOf(search));	// 앞에서부터 찾기 시작(문자, 문자열 둘 다 가능)해서 인덱스 반환
		
		
		str = "hello world!";
		String subStr = str.substring(3, 8);	// 3~7까지의 문자열로 변환
		System.out.println("substring(3, 8) : " + subStr);
		
		
		String str2 = "hello" + "!!!";
		str2 = "hello".concat("!!!");
		System.out.println("concat() : " + str2);
		
		
		String result = str.replace("l", "rr");
		System.out.println(result);
		
		
		str = "    hello world     ";
		System.out.println(str.length());
		result = str.trim();
		System.out.println(result.length());
		
		
		str = "Hello world!";
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		String data = "홍길동:허균:조선시대";
		String[] bookInfo = data.split(":");
		System.out.println(Arrays.toString(bookInfo));
		
		
		int num = 123;
		String strNum = String.valueOf(num);	 // num + ""
		System.out.println(strNum + 100);
	}
}
