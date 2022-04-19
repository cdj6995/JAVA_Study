package kr.ac.kopo.day06;

public class MethodMain04 {
	public static void main(String[] args) {
		Gugudan gugu = new Gugudan();
		
		/*
		Scanner sc = new Scanner(System.in);
		int dan = Integer.parseInt(sc.nextLine());

		
		
		gugu.print(dan);
		
		gugu.print();
		
		*/
		
		/*
		System.out.print("2-9 사이의 단을 입력 : ");
		int startDan = gugu.getDan();
		
		System.out.print("2-9 사이의 단을 입력 : ");
		int endDan = gugu.getDan();
		
		// 시작부터 종료단까지의 구구단 출력
		gugu.print(startDan, endDan);
		*/
		
		// 3단씩 출력
		gugu.print3(2);
	}

}
