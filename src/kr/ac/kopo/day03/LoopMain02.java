package kr.ac.kopo.day03;

/*
	init;
	do {
		statement;
		incre/decre;
	} while(expr);
	
		=> 주로 에러 체크할 때 사용 or 메뉴화면
			(비밀번호 적을 때 맞으면 넘어가고 아니면 계속 다시 시도)
			
	---------------------------------------------------------
			
	횟수를 알거나, 시작값과 종료값을 알 때 => for문 주로 사용
	얼마나 돌지는 모르지만 종료값만 알 때 => while문 사용
	 
 */

public class LoopMain02 {
	
	public static void main(String[] args) {
		
		int cnt = 1;
		do {
			System.out.println("Hello");
			cnt++;
		}while(cnt <= 5);
		
		System.out.println("===============================");
		
		
		cnt = 1;
		while(true) {
			System.out.println("Hello");
			cnt++;
			if(cnt > 5) break;
		}
	}

}
