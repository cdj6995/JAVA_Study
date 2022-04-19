package homework.day0311;

import java.util.Scanner;

class Numprint {
	
	int getnum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1 ~ 100 사이의 정수를 입력 : ");
		int num = Integer.parseInt(sc.nextLine());
		return num;
	}
	
	void print(int num) {
		System.out.printf(" < 1 ~ %d 정수 출력 > \n", num);
		int a = 1;
		while(a <=num) {
			System.out.printf("%d ", a++);
		}
	}
}


public class Problem01 {
	public static void main(String[] args) {
		
		// 클래스를 이용한 풀이
		Numprint np = new Numprint();
		
		int num = np.getnum();	// 정수 입력받기
		np.print(num);	// 출력
		
		
		/* 일반 풀이
		Scanner sc = new Scanner(System.in);
		System.out.print("1 ~ 100사이의 정수를 입력 : ");
		int num = sc.nextInt();
		
		System.out.printf(" < 1 ~ %d 정수 출력 > ", num);
		System.out.println();
		for(int i = 1; i <= num; i++) {
			System.out.print(i + " ");
		}
		*/
	}
}
