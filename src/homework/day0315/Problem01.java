package homework.day0315;

import java.util.Scanner;

class Icecream{
	
	String name;	// 아이스크림 명
	int price;		// 아이스크림 가격
}


public class Problem01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이스크림 몇 개 구입할꺼야? => ");
		int total = Integer.parseInt(sc.nextLine());
				
		
		// 입력받은 개수만큼의 배열 생성
		Icecream[] ice = new Icecream[total];
		
		// 총 판매액 초기화
		int sum = 0;
		
		// 아이스크림 정보 입력받기
		for(int i = 0; i < ice.length; i++) {
			// 배열의 각각의 인덱스를 생성자를 통해 지정
			ice[i] = new Icecream();
			System.out.printf(" *** %d번째 아이스크림 구매정보 *** \n", i+1);
			System.out.print("아이스크림 명 : ");
			ice[i].name = sc.nextLine();	// next() - 단어단위 구분, nextLine() - 라인단위 구분
			System.out.print("아이스크림 가격 : ");
			ice[i].price = Integer.parseInt(sc.nextLine());
			
			sum += ice[i].price;
		}
		
		
		System.out.printf("< 총 %d개의 아이스크힘 구매정보 출력 >\n", total);
		for(int i = 0; i < ice.length; i++) {
			System.out.printf("%d\t %s\t %d \n", i+1, ice[i].name, ice[i].price);
		}
		
		/*
		int cnt = 0;
		for(Icecream ic : ice) {
			System.out.printf("%d\t%s\t%d\n", ++cnt, ic.name, ic.price);
		}
		*/
		
		System.out.printf("총 판매액 : %d원", sum);
		sc.close();
	}
}
