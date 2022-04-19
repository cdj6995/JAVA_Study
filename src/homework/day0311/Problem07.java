package homework.day0311;

public class Problem07 {
	public static void main(String[] args) {
		
		// 한 줄에 3단씩 출력이므로 dan을 3씩 증가
		for(int dan = 2; dan <= 9; dan += 3) {
			
			for(int i = 0; i <= 9; i++) {
				
				// 3개씩 출력이므로 dan에서 dan+2까지 범위 설정
				for(int j = dan; j <= 9 && j<=dan+2; j++) {
					if(i == 0) {
						System.out.printf("*** %2d단  ***\t", j);
					} else {
						System.out.printf("%2d * %2d = %2d\t", j, i, j*i);
					}
				}
				System.out.println();
			}
			System.out.println();
			
		}
	}
}
