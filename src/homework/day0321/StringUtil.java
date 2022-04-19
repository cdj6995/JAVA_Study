package homework.day0321;

import java.util.Scanner;

public class StringUtil {	
	Scanner sc = new Scanner(System.in);
	
	// 하나의 문자 입력받기
	char getChar() {
		char c = sc.nextLine().charAt(0);
		return c;
	}
	
	// 문자열 입력받기
	String getString() {
		String str = sc.nextLine();
		return str;
	}
	
	
	// 8. 문자열 개수
	public static int checkChar(String strData, char ch) {
		int cnt = 0;
		for(int i = 0; i < strData.length(); i++) {
			if(strData.charAt(i) == ch) {
				cnt++;
			}
		}
		return cnt;
	}
	
	// 9. 문자열 제거
	public static String removeChar(String oriStr, char delChar) {
		String result = "";
		for(int i = 0; i < oriStr.length(); i++) {
			if(oriStr.charAt(i) != delChar) {
				result += oriStr.charAt(i);
			}
		}
		return result;
	}
	
	
}
