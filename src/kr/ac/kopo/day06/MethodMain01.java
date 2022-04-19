package kr.ac.kopo.day06;

/*
 	*****
 	Hello
 	*****
 	Hi
 	*****
 	Bye
 	*****
 	
 	반환형 메소드명([파라미터]){
 		문장;
 	}
 	
 */


public class MethodMain01 {
	
	static int printStar(char ch, int cnt) {
				
		return ch + cnt;
	}
	
	public static void main(String[] args) {
		int result1 = printStar('A', 3);
		System.out.println(result1);
		int result2 = printStar('B', 5);
		System.out.println(result2);
		
	}

}
