package Boj;

import java.util.Arrays;
import java.util.Scanner;

public class number1920 {

	
	static int binary(String[] narr, String[] marr, int index) {
		int start = 0;
		int end = narr.length-1;
		int mid = (start + end) / 2;
		
		while(start <= end) {
			if(narr[mid].equals(marr[index])) {
				return 1;
			}else if(Integer.parseInt(narr[mid]) > Integer.parseInt(marr[index])) {
				end = mid -1;
			}else {
				start = mid + 1;
			}
			mid = (start + end) / 2;
		}
		return 0;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		String arr1 = sc.nextLine();
		String[] narr = arr1.split(" ");
		
		Arrays.sort(narr);
		
		int M = Integer.parseInt(sc.nextLine());
		String arr2 = sc.nextLine();
		String[] marr = arr2.split(" ");
		
		
		for(int i = 0; i < M; i++) {
			int result = binary(narr, marr, i);
			System.out.println(result);
		}
	}
}

//		List<String> Narr = new ArrayList();		


//		for(int i = 0; i < N; i++) {
//			Narr.add(narr[i]);
//		}


//		for(int i = 0; i < M; i++) {
//			if(Narr.contains(marr[i])) {
//				System.out.println(1);
//			}else {
//				System.out.println(0);
//			}
//		}
