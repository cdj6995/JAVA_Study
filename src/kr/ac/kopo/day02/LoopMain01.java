package kr.ac.kopo.day02;

/*
 	반복을 위한 기본요소 4가지
 	1. 반복할 문장 (statement)
 	2. 시작값 (init)
 	3. 증가/감소 (incre/decre)
 	4. 종료조건 (expr)
 	

 	한 바퀴 뛸 차례다;

 	while(!열바퀴 다 뛰었냐?) {
 		운동장 한 바퀴 뛴다;
 		바퀴 수 증가;
 	}
 	
 	1.init;
 	while(2.expr) {
 		3.statement;
 		4.incre/decre;
 	}
 	5. ~~
 	
 	
 	1 -> 2 조건 참 -> 3 -> 4
 	  -> 2 조건 참 -> 3 -> 4
 	  -> 2 조건 참 -> 3 -> 4
 	  -> 2 조건 거짓 -> 5
 	  
----------------------------------------------------------

	for(1.init; 2.expr; 3.incre/decre) {
		4.statement;
	}
	5. ~~
	
	1 -> 2 조건 참 -> 4 -> 3
	  -> 2 조건 참 -> 4 -> 3
	  -> 2 조건 거짓 -> 5
	
 */

public class LoopMain01 {
	public static void main(String[] args) {
		
//		int cnt = 0;
//		
//		while(cnt < 10) {
//			System.out.println(cnt + "바퀴 째 뛰는 중~");
//			cnt += 1;
//			if(cnt == 10) {
//				System.out.println(cnt + "바퀴 완료");
//			}
//		}
		
//		int cnt = 1;
//		
//		System.out.println("--------while 반복문 시작--------");
//
//		while(cnt <= 5) {
//			System.out.println("Hello");
//			++cnt;
//		}
//		
//		System.out.println("--------while 반복문 종료--------");

		
		
		System.out.println("--------for 반복문 시작--------");

		for(int cnt=1; cnt<=5; ++cnt) {
			System.out.println("Hello");
		}
		
		System.out.println("--------for 반복문 종료--------");
	}

}

/*
 	for문 안의 cnt 변수는 for문 안에서만 돈다. (변수의 라이프사이클 => 변수는 선언한 블럭 안에서만 돈다)
 		=> 그래서 동일한 cnt 변수명을 사용해도 for문 하고 while문 하면 error나지 않는다.
 			하지만, while문 하고 for문을 하면 error(cnt가 중복)가 난다!
*/
