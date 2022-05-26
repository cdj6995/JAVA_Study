package Boj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class number1254 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] word = str.split("");
		String[] word2 = str.split("");
		
		
		List<String> words = new ArrayList();	// String[] => List
		List<String> reverse_words = new ArrayList();
		
		for(int i = 0; i < word.length; i++) {
			words.add(word[i]);
			reverse_words.add(word2[i]);
		}
		
		Collections.reverse(reverse_words);		// 역순으로
		

		int cnt = 0;
		
		while(true) {
			if(words.equals(reverse_words)) {
				System.out.println(word.length + cnt); 
				break;
			}else {
				cnt++;
				reverse_words.remove(reverse_words.size()-1);
				words.remove(0);
			}
		}
		
		
	}
}
