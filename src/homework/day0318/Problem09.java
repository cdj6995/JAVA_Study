package homework.day0318;

import java.util.Scanner;

class IcecreamRe {
	
	String name;	// 아이스크림 이름
	int price;	// 아이스크림 가격
	
	Scanner sc = new Scanner(System.in);
	
	// 아이스크림 개수 입력받기
	int getCnt() {
		System.out.printf("아이스크림 몇개 구입할래? => ");
		int count = Integer.parseInt(sc.nextLine());
		System.out.println();
		return count;
	}
	
	// 아이스크림 정보 입력받기
	IcecreamRe[] info(int cnt) {
		IcecreamRe[] ice = new IcecreamRe[cnt];
		
		for(int i = 0; i < cnt; i++) {
			ice[i] = new IcecreamRe();
			System.out.printf(" *** %d번째 아이스크림 구매정보 *** \n", i+1);
			System.out.print("아이스크림 명 : ");
			ice[i].name = sc.nextLine();
			System.out.print("아이스크림 가격 : ");
			ice[i].price = Integer.parseInt(sc.nextLine());
		}
		return ice;
	}
	
	// 아이스크림 정보 출력하기
	void printInfo(IcecreamRe[] ice) {
		int sum = 0;
		System.out.printf(" < 총 %d개의 아이스크림 구매 정보 출력 > \n", ice.length);
		for(int i = 0; i < ice.length; i++) {
			System.out.printf("%d \t %s \t %d", i+1, ice[i].name, ice[i].price);
			System.out.println();
			
			sum += ice[i].price;
		}
		
		System.out.printf("총 판매액 : %d원", sum);
	}
}

public class Problem09 {
	public static void main(String[] args) {
		IcecreamRe icecream = new IcecreamRe();
		
		// 개수 입력받기
		int cnt = icecream.getCnt();
		
		// 아이스트림 정보 입력받기
		IcecreamRe[] ice = icecream.info(cnt);
		
		// 아이스크림 정보 출력
		icecream.printInfo(ice);
	}
}