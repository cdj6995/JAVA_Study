package homework.day0311;

public class Problem05 {
	public static void main(String[] args) {
		
		for(int i = 2; i <= 9; i++) {
			System.out.printf("*** %d단 ***", i);
			System.out.println();
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d", i, j, i*j);
				System.out.println();
			}
		}
	}
}
