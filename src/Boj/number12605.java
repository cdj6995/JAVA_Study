package Boj;

import java.util.Scanner;

public class number12605 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = Integer.parseInt(sc.nextLine());
		
		for(int tc = 1; tc <= testCase; tc++) {
			String sentence = sc.nextLine();
			String[] words = sentence.split(" ");
			System.out.printf("Case #%d:", tc);
			for(int i = words.length-1; i >= 0; i--) {
				System.out.printf(" %s", words[i]);
			}
			System.out.println();
		}
		
	}
	
}
