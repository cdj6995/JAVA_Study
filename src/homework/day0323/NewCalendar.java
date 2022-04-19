package homework.day0323;

import java.util.Calendar;
import java.util.Scanner;

public abstract class NewCalendar {

	static Scanner sc = new Scanner(System.in);
	static int year;
	static int month;
	Calendar c = Calendar.getInstance();
	
	String[] week = {"", "일", "월", "화", "수", "목", "금", "토"};
	
	
	public NewCalendar(){}
	
	public NewCalendar(int year){
		this.year = year;
	}
	public NewCalendar(int year, int month){
		this.year = year;
		this.month = month;
	}
	
	
	public static int select() {
		System.out.print("원하는 항목을 선택하세요 => ");
		int type = Integer.parseInt(sc.nextLine());
		return type;
	}
	
	// 추상 메소드
	public abstract void print();
}
