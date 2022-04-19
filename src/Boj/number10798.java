package Boj;

import java.util.Scanner;

class Read{
	
	Scanner sc = new Scanner(System.in);
	String[] arr = new String[5];
	
	String[] line() {
		for(int i = 0; i < 5; i++) {
			arr[i] = sc.nextLine();
		}
		return arr;
	}
	
	int maxLen(String[] arr) {
		int max = 0;
		for(int i = 0; i < arr.length; i++) {
			max = arr[i].length() > max ? arr[i].length() : max;
		}
		return max;
	}
	
	void print(String[] arr, int max) {
		for(int i = 0; i < max; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(arr[j].length() <= i) continue;
				else
					System.out.print(arr[j].charAt(i));
			}
		}
	}
}

public class number10798 {

	public static void main(String[] args) {
		
		Read re = new Read();
		
		String[] arr = re.line();
		
		int max = re.maxLen(arr);
		
		re.print(arr, max);
	}
}
