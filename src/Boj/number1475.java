package Boj;

import java.util.Scanner;

public class number1475 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] number = {'0','1','2','3','4','5','6','7','8','9'};
		
		String str = sc.nextLine();
		
		int maxCnt = 0;
		
		for(int i = 0; i < number.length; i++) {
			int cnt = 0;
			for(int j = 0; j < str.length(); j++) {
				if(number[i] == str.charAt(j) && str.charAt(j) != '6' && str.charAt(j) != '9') {
					cnt++;
				}
			}
			maxCnt = maxCnt > cnt ? maxCnt : cnt;
			
		}
		
		int othercnt = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '6' || str.charAt(i) == '9') {
				othercnt++;
			}
		}
		
		if(othercnt % 2 == 0)
			othercnt = othercnt / 2;			
		else
			othercnt = (othercnt+1) / 2;
			
		maxCnt = maxCnt > othercnt ? maxCnt : othercnt;
		
		System.out.print(maxCnt);
		sc.close();
	}
}
