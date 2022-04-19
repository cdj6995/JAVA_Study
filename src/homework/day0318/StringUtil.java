package homework.day0318;

import java.util.Scanner;

public class StringUtil {	
	Scanner sc = new Scanner(System.in);
	
	// 하나의 문자 입력받기
	char getChar() {
		char c = sc.nextLine().charAt(0);
		return c;
	}
	
	// 하나의 정수 입력받기
	int getInt() {
		int n = Integer.parseInt(sc.nextLine());
		return n;
	}
	
	// 문자열 입력받기
	String getString() {
		String str = sc.nextLine();
		return str;
	}
	
	
	// 1. 문자가 대문자인지 확인
	boolean isUpperChar(char c) {
		if(c >= 'A' && c <= 'Z')
			return true;
		else
			return false;
	}
	
	// 2. 문자가 소문자인지 확인
	boolean isLowerChar(char c) {
		if(c >= 'A' && c <= 'Z')
			return false;
		else
			return true;
	}
	
	// 3. 두 수 입력받아 큰 수 반환
	int max(int i, int j) {
		if(i > j)
			return i;
		else
			return j;
	}
	
	// 4. 두 수 입력받아 작은 수 반환
	int min(int i, int j) {
		if(i > j)
			return j;
		else
			return i;
	}
	
	// 5. 문자열 거꾸로 변경
	void reverseString(String str) {
		String result = "";
		for(int i = str.length()-1; i >= 0; i--) {
			result += str.charAt(i);
		}
		System.out.println(result);
	}
	
	// 6. 문자열을 입력받아 대문자로 변경
	void toUpperString(String str) {
		String result= "";
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				result += str.charAt(i);
			} else {
				result += (char) (str.charAt(i) - ('a' - 'A'));
			}
		}
		System.out.println(result);
	}
	
	// 7. 문자열을 입력받아 소문자로 변경
	void toLowerString(String str) {
		String result= "";
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				result += (char) (str.charAt(i) + ('a' - 'A'));
			} else {
				result += str.charAt(i);
			}
		}
		System.out.println(result);
	}
	
}
