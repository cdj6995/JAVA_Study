package homework.day0321;

import java.util.Scanner;

class IcecreamRe {
	
	String name;	// 아이스크림 이름
	int price;	// 아이스크림 가격
	static int sum;
	static int totalCnt;	// 아이스크림 총 개수
	
	Scanner sc = new Scanner(System.in);
	
	// 아이스크림 개수 입력받기
	public int getCnt() {
		System.out.printf("아이스크림 몇개 구입할래? => ");
		int count = Integer.parseInt(sc.nextLine());
		System.out.println();
		totalCnt += count;
		return count;
	}
	
	// 아이스크림 정보 입력받기
	public IcecreamRe[] info(int cnt) {
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
	public void printInfo(IcecreamRe[] ice) {
		System.out.printf(" < 총 %d개의 아이스크림 구매 정보 출력 > \n", ice.length);
		for(int i = 0; i < ice.length; i++) {
			System.out.printf("%d \t %s \t %d", i+1, ice[i].name, ice[i].price);
			System.out.println();
			
			sum += ice[i].price;
		}
	}
	
	// 다시 한번 묻기
	public String reTry() {
		System.out.println();
		System.out.print("계속 주문하시겟습니까? ");
		String ch = sc.nextLine();
		return ch;
	}
	
	// 총 개수 및 금액 출력
	public static void totalprint() {
		System.out.println("총 판매개수 : " + totalCnt + "개");
		System.out.println("총 판매액 : " + sum + "원");
	}
}

public class Icecream {
	public static void main(String[] args) {
		IcecreamRe icecream = new IcecreamRe();
		
		while(true) {
			// 개수 입력받기
			int cnt = icecream.getCnt();
			
			// 아이스트림 정보 입력받기
			IcecreamRe[] ice = icecream.info(cnt);
			
			// 아이스크림 정보 출력
			icecream.printInfo(ice);
			
			// 계속 주문 할지 질문
			String response = icecream.reTry();
			
			if(response.equalsIgnoreCase("n")) break;
			
		}
		// 총 판매 개수 및 판매액 출력
		IcecreamRe.totalprint();
	}
}