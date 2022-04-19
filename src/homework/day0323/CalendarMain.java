package homework.day0323;

public class CalendarMain {

	public static void main(String[] args) {
		
		/*
		int type = NewCalendar.select();
		
		if(type == 1) {
			NewCalendar nc = new YearCalendar(NewCalendar.year);
			nc.print();
		} else if(type == 2) {
			NewCalendar nc = new MonthCalendar(NewCalendar.year, NewCalendar.month);
			nc.print();
		} else {
			System.out.println("종료");
		}
		*/
		
		CalendarView view = new CalendarView();
		view.process();
		
	}
}
