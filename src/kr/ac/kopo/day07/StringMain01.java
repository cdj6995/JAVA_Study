package kr.ac.kopo.day07;

import java.util.Arrays;

public class StringMain01 {
	public static void main(String[] args) {
		
		String str = new String("hello");
		char[] chars = {'h','e','l','l','o'};
		String str2 = new String(chars);
		
		System.out.println("str : " + str);
		System.out.println("str2 : " + str2);
		
		str = new String("Hello World!!!");
		System.out.println("str : " + str + ", 길이 : " + str.length());
		
		
		int loc = 0;
		char[] words = new char[5];
		str.getChars(6, 11, words, loc);
		
//		for(int i = 6; i <= 10; i++) {
////			System.out.println(str.charAt(i));		// 특정 위치의 문자 출력
//			words[loc++] = str.charAt(i);
//		}
		
		words = new char[str.length()];
		str.getChars(0, str.length(), words, loc);
		
		System.out.println("words : " + Arrays.toString(words));
		for(char c : words) {
			System.out.print(c);
		}
		
		
	}

}
