package Boj;

import java.util.Scanner;

public class number1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		word = word.trim();
		if(word.equals("")) {
			System.out.println(0);
		}else {
			String[] words = word.split(" ");
			System.out.println(words.length);			
		}
		
	}
}
