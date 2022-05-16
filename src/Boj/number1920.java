package Boj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class number1920 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		String arr1 = sc.nextLine();
		List<String> Narr = new ArrayList();
		
		String[] narr = arr1.split(" ");
		
		
		for(int i = 0; i < N; i++) {
			Narr.add(narr[i]);
		}
		
		int M = Integer.parseInt(sc.nextLine());
		String arr2 = sc.nextLine();
		String[] marr = arr2.split(" ");
		
		
		for(int i = 0; i < M; i++) {
			if(Narr.contains(marr[i])) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}
	}
}


