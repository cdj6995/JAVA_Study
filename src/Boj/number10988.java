package Boj;

import java.util.Scanner;

class Palin {
	Scanner sc = new Scanner(System.in);
	
	String getString() {
		String str = sc.nextLine();
		return str;
	}
	
	void palin(String str) {
		String result= "";
		int flag = 0;
		for(int i = str.length()-1; i >= 0; i--) {
			result += str.charAt(i);
		}
		if(result.equals(str))
			flag = 1;
		
		System.out.println(flag);
		
	}
}

public class number10988 {

	public static void main(String[] args) {
		Palin pal = new Palin();
		
		String str = pal.getString();
		pal.palin(str);
	}
}
