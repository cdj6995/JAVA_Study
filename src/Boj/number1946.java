package Boj;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class number1946 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = Integer.parseInt(sc.nextLine());
		
		for(int  testcase = 0; testcase < t; testcase++) {
			int n = Integer.parseInt(sc.nextLine());
			Map<Integer, Integer> map = new HashMap<>();
			for(int i = 0; i < n; i++) {
				map.put(sc.nextInt(), sc.nextInt());
			}
			
			
		}
	}
}
