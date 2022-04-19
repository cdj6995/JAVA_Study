package homework.day0311;

public class Problem10 {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 9; i++) {
			// 행을 5이하와 초과로 구분
			int cnt = i <= 5 ? i : 9-i+1;
			
			// 5번째 행은 중복되므로 따로 구분
			if(cnt == 5) {
				for(int j = 1; j <= 9; j++) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				// 왼쪽 '*' 찍기
				for(int j = 1; j <= cnt; j++) {
					System.out.print("*");
				}
				
				// 가운데 '-' 찍기
				for(int k = 1; k <= 9-(2*cnt); k++) {
					System.out.print("-");
				}
				
				// 오른쪽 '*' 찍기
				for(int l = 1; l <= cnt; l++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
