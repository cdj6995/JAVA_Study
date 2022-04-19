package homework.day0323;

import java.util.Calendar;

public class MonthCalendar extends NewCalendar {
	
	public MonthCalendar(int year, int month) {
		super(year,month);
	}
	
	@Override
	public void print() {
		
		System.out.print("년도를 선택하세요 : ");
		year = Integer.parseInt(sc.nextLine());
		System.out.print("월을 선택하세요 : ");
		month = Integer.parseInt(sc.nextLine());
		System.out.printf(" < %d년 %d월 > \n", year, month);
		
		for(int i = 1; i < week.length; i++) {
			System.out.printf("%s\t",week[i]);
		}
		System.out.println();
		
		
		c.set(year, month-1,1);
		int lastday = c.getActualMaximum(Calendar.DATE);	// 해당 달이 몇일까지 있는지 확인
		int startday = c.get(Calendar.DAY_OF_WEEK);			// 시작하는 날이 몇요일인지 확인
		int cnt = 0;
		
		while(cnt < lastday) {
			if(cnt == 0) {
				// 시작하는 요일이 오기 전까지 건너 뛰기 
				for(int j = 0; j< startday-1; j++)
					System.out.print(" \t");
				System.out.printf("%2d\t", ++cnt);
			}else {
				System.out.printf("%2d\t", ++cnt);
			}
			
			// 7일마다 enter
			if( (cnt + startday-1) % 7 == 0) {
				System.out.println();
			}
		}
	}	
	
}
