package homework.day0310;

import java.util.Scanner;

public class problem08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("물건값을 입력 : ");
		int price = sc.nextInt();
		
		System.out.print("지불한 돈의 액수 : ");
		int charge = sc.nextInt();
		
		System.out.println();
		
		int change = charge - price;
		System.out.println("거스름돈 : " + change);
		
		System.out.printf("%4d 원 : %d 개 \n", 1000, change / 1000);
		change = change % 1000;	// 잔돈을 개수를 세고 남은 금액으로 수정
		
		System.out.printf("%4d 원 : %d 개 \n", 500, change / 500);
		change = change % 500;	// 잔돈을 개수를 세고 남은 금액으로 수정
		
		
		System.out.printf("%4d 원 : %d 개 \n", 100, change / 100);
		change = change % 100;	// 잔돈을 개수를 세고 남은 금액으로 수정
		
		
		System.out.printf("%4d 원 : %d 개 \n", 50, change / 50);
		change = change % 50;	// 잔돈을 개수를 세고 남은 금액으로 수정
		
		
		System.out.printf("%4d 원 : %d 개 \n", 10, change / 10);
		change = change % 10;	// 잔돈을 개수를 세고 남은 금액으로 수정
		
	}
}
