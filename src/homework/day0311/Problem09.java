package homework.day0311;

public class Problem09 {
	public static void main(String[] args) {
		for(int i = 0; i <= 4; i++) {
			
			// 행이 증가할수록 '-'를 하나씩 증가
			if(i > 0) {
				for(int k = 1; k <= i; k++) {
					System.out.print("-");
				}
			}
			
			// 행이 증가할수록 '*' 개수를 2씩 감소
			for(int j = 1; j <=9-2*i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
