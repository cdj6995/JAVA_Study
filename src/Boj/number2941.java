package Boj;

import java.util.Scanner;

class Cro{
	Scanner sc = new Scanner(System.in);
	
	String[] cro = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
	
	String getStr() {
		String str = sc.nextLine();
		return str;
	}
	
	int count(String str) {
		String search;
		for(int i = 0; i < cro.length; i++) {
			search = cro[i];
			str = str.replace(search, "1");
			}
		return str.length();
	}
	
}


public class number2941 {
	public static void main(String[] args) {
		Cro cr = new Cro();
		
		String str = cr.getStr();
		
		int result = cr.count(str);
		
		System.out.println(result);
	}
}