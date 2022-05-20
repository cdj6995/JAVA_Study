package Boj;

import java.util.Scanner;

public class number1264 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] words = {"a","e","i","o","u"};
		
		while(true) {
			String input = sc.nextLine();
			String[] str = input.split("");
			int cnt = 0;
			
			if(input.equals("#")) {
				break;
			}
			
			for(int i = 0; i < str.length; i++) {
				for(int j = 0; j < words.length; j++) {
					if(str[i].toLowerCase().equals(words[j])) {
						cnt++;
					}
				}
			}
			
			System.out.println(cnt);
		}
	}
}
