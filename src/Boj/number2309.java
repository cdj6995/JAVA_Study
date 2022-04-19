package Boj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class number2309 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<>();
		
		int sum = 0;
		
		for(int i = 0; i < 9; i++) {
			int num = sc.nextInt();
			list.add(num);
			sum += num;
		}
		
		Collections.sort(list);
		
		first: for(int i = 0; i < 8; i++) {
			for(int j = i+1; j < 9; j++) {
				if(sum - list.get(i) - list.get(j) == 100) {
					list.remove(j);
					list.remove(i);
					break first;
				}
			}
		}
		
		for(int i = 0; i < 7; i++) {
			System.out.println(list.get(i));
		}
	}
}
