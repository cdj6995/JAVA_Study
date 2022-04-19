package homework.day0310;

import java.util.Scanner;

public class problem07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력(알파벳) : ");
		String inputStr = sc.nextLine();
		char alpa = inputStr.charAt(0);
		
		// 입력받은 값이 대문자일 경우
		if((int)alpa >= (int)'A' && (int)alpa <= (int)'Z') {
			System.out.print("변경된 값 : ");
			// 대문자를 소문자로 변경
			System.out.println( (char)(((int)alpa - (int)'A') + (int)'a') );
		} else {	// 입력받은 값이 소문자일 경우
			System.out.print("변경된 값 : ");
			// 소문자를 대문자로 변경
			System.out.println( (char)(((int)alpa - (int)'a') + (int)'A') );
		}
		
		
	}
}
