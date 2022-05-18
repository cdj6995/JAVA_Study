package Boj;

import java.util.Arrays;
import java.util.Scanner;

public class number2798 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 int N = Integer.parseInt(sc.next());
		 int M = Integer.parseInt(sc.next());
		 sc.nextLine();
		 
		 String arr = sc.nextLine();
		 String[] Arr = arr.split(" ");
		 
		 Arrays.sort(Arr);
		 
		 int result = 0;
		 
		 for(int i = 0; i < N-2; i++) {
			 for(int j = i+1; j < N-1; j++) {
				 for(int k =j+1; k < N; k++) {
					 if(Integer.parseInt(Arr[i]) + Integer.parseInt(Arr[j]) + Integer.parseInt(Arr[k]) <= M) {
						 result = Math.max(result, Integer.parseInt(Arr[i]) + Integer.parseInt(Arr[j]) + Integer.parseInt(Arr[k]));
					 }
				 }
			 }
		 }
		 System.out.println(result);
	}
}
