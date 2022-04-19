package Boj;

import java.util.Arrays;
import java.util.Scanner;

public class number6996 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < t; i++) {
			String str1 = sc.next();
			String str2 = sc.next();
			
			
			char[] ch1 = new char[str1.length()];
			char[] ch2 = new char[str2.length()];
			
			for(int j = 0; j < str1.length(); j++) {
				ch1[j] = str1.charAt(j);
			}
			for(int j = 0; j < str2.length(); j++) {
				ch2[j] = str2.charAt(j);
			}
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			
			int flag = 0;
			for(int j = 0; j < ch1.length; j++) {
				try {
					if(ch1[j] != ch2[j]) {
						flag = 1;						
						break;					
					}
				}catch(Exception e){
					flag = 1;						
					break;					
				}
			}
			
			if(flag == 0) {
				System.out.println(str1 + " & " + str2 + " are anagrams.");
			}else {
				System.out.println(str1 + " & " + str2 + " are NOT anagrams.");
			}
		}
	}
}
