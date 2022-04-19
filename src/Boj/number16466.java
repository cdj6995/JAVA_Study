package Boj;

import java.util.Arrays;
import java.util.Scanner;

public class number16466 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int soldout = Integer.parseInt(sc.nextLine());
		
		int[] numberlist = new int[soldout];
		for(int i = 0; i < soldout; i++) {
			numberlist[i] = sc.nextInt();
		}
		
		Arrays.sort(numberlist);
		int flag = 0;
		
		for(int i = 0; i < soldout; i++) {
			if(numberlist[i] != i+1) {
				flag = 1;
				System.out.println(i+1);
				break;
			}
		}
		
		if(flag == 0) {
			System.out.println(soldout+1);
		}
		
	}
}
