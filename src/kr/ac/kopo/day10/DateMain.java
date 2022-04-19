package kr.ac.kopo.day10;

import java.util.Calendar;
import java.util.Date;

public class DateMain {

	public static void main(String[] args) {
		
		/*
		Date d = new Date();
		System.out.println(d);
		
		// 오늘은 2022년 3월 23일(수)입니다.
		
		int year = d.getYear() + 1900;
		int month= d.getMonth() + 1;
		int date = d.getDate();
		int day = d.getDay();
		String[] week = {"일","월","화","수","목","금","토"};
		
		System.out.println("오늘은 " + year + "년 " + month + "월 " + date + "일(" + week[day] + ") 입니다");
		*/
		
		
		
		Calendar c = Calendar.getInstance();
//		System.out.println(c);
		
//		int year = c.get(1);
		int year = c.get(Calendar.YEAR);
//		int month = c.get(2);
		int month = c.get(Calendar.MONTH) + 1;
		int date = c.get(Calendar.DATE);
		int day = c.get(Calendar.DAY_OF_WEEK);
		String[] week = {"","일","월","화","수","목","금","토"};
		
		System.out.println("오늘은 " + year + "년 " + month + "월 " + date + "일(" + week[day] + ")입니다");
	
		// 2020년 5월 20일이 무슨 요일!?
		c.set(2020, 5-1, 20);
		day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("2020/5/20 " + week[day] + "요일");
		
		// 5월의 마지막날이 몇일?
		int lastday = c.getActualMaximum(Calendar.DATE);
		System.out.println(lastday);
		
		Date d = c.getTime();
		System.out.println(d);
		
		
		
//		String pattern = "yyyy-MM-dd hh:mm:ss(E)";
//		String pattern = "yyyy년도 MM월 dd일 HH시 mm분 ss초 E요일";
//		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
//		System.out.println(sdf.format(new Date()));
	}
	
}
