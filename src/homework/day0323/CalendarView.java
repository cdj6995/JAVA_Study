package homework.day0323;

import java.util.Scanner;

public class CalendarView {

	private Scanner sc = new Scanner(System.in);
	
	// 정수를 입력받으면서 질문도 같이 받기
	private int getInt(String msg) {
		System.out.print(msg);
		return Integer.parseInt(sc.nextLine());
	}
	
	public void process() {
		CalendarUtil util = new CalendarUtil();
		while(true){
			int type = getInt("항목을 선택하세요(1.특정 년도 2.특정 월 3.이전달 4.다음달 5.현재달 0.종료) ");
			int year = 0, month = 0;
			switch(type) {
			case 1:
				year = getInt("년도를 입력하세요 : ");
				util.showByYear(year);
				break;
			case 2:
				year = getInt("년도를 입력하세요 : ");
				month = getInt("월을 입력하세요 : ");
				util.showByMonth(year, month);
				break;
			case 0:
				System.out.println("종료");
				System.exit(0);		// 프로그램 종료 => 그럼 클래스 전체가 다 종료인가??
			}
		}
	}
}
