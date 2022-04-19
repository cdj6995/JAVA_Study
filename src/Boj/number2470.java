package Boj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class number2470 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> negative = new ArrayList<>();
		List<Integer> postive = new ArrayList<>();
		
		int n = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < n; i++) {
			int num = sc.nextInt();
			if(num > 0) {
				postive.add(num);
			} else {
				negative.add(num);
			}
		}
		
		
		Collections.sort(postive);
		Collections.sort(negative);
		
		int large = postive.get(postive.size()-1) + negative.get(0);
		large = large > 0 ? large : large * -1;
		int small = postive.get(0) + negative.get(negative.size()-1);
		small = small > 0 ? small : small * -1;
		
		int result = large > small ? small : large; 
		
		int negativeNum = 200;
		int postiveNum = 200;
		if(negative.size() >= 2 && result > negative.get(negative.size()-2)) {
			negativeNum = (negative.get(negative.size()-1) + negative.get(negative.size()-2)) * -1 ;
			result = result > negativeNum ? negativeNum : result;
		}
		if(postive.size() >= 2 && result > postive.get(1)) {
			postiveNum = postive.get(0) + postive.get(1);
			result = result > postiveNum ? postiveNum : result;
		}
		
		
		if(result == large) {
			System.out.printf("%d %d", negative.get(0), postive.get(postive.size()-1));
		}else if(result == small) {
			System.out.printf("%d %d", negative.get(negative.size()-1), postive.get(0));
		}else if(result == negativeNum) {
			System.out.printf("%d %d", negative.get(negative.size()-2), negative.get(negative.size()-1));
		}else {
			System.out.printf("%d %d", postive.get(0), postive.get(1));
		}
	}
}
