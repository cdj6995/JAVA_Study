package homework.day0311;

public class Problem08 {
	public static void main(String[] args) {
		
		// 9개의 행 생성
		for(int i = 1; i <= 9; i++) {
			// 5이하일 때와 이상일 때를 구분
			int count = i <=5 ? i : 9-i+1;
			
			// 5개의 열을 고정으로 놓고 경우에 따라 문자 구분
			for(int j = 1; j <= 5; j++) {
				if(j >= count) {
					System.out.print("*");
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}
}
