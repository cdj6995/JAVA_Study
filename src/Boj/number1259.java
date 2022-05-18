package Boj;

import java.util.Scanner;

public class number1259 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String pal = sc.nextLine();
			String[] palin = pal.split("");
			
			
			if(pal.equals("0")) {
				break;
			}else {
				int flag = 0;
				for(int i= 0; i < (pal.length() / 2); i++) {
					if(!palin[i].equals(palin[pal.length()-(i+1)])) {
						flag = 1;
						break;
					}
				}
				if(flag == 0) {
					System.out.println("yes");
				}else {
					System.out.println("no");
				}
			}
		}
	}
}
