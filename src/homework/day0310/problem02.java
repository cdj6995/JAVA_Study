package homework.day0310;

import java.util.Scanner;

public class problem02 {
	public static void main(String[] args) {
		
		// 시간 입력 받기
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		
		System.out.print("결과출력 : ");
		
		// 시간에 해당하는 값 구하기
		int hour = time / 3600;
		
		// 분에 해당하는 값 구하기
		int min = (time - hour * 3600) / 60;
		
		// 초에 해당하는 값 구하기
		int sec = time % 60;

		
		if(hour == 0) {		// 시간이 0일 경우, 시간을 제외
			if(min == 0) {
				System.out.println(sec + "초");		// 분이 0일 경우, 분을 제외
			} else if(sec == 0) {
				System.out.println(min + "분 ");		// 초가 0일 경우, 초을 제외
			} else {
				System.out.println(min + "분 " + sec + "초");
			}
		} else if(min == 0) {	// 분이 0일 경우, 분을 제외
			if(sec == 0) {
				System.out.println(hour + "시간 ");	// 초가 0일 경우, 초을 제외
			} else {
				System.out.println(hour + "시간 " + sec + "초");
			}
		} else if(sec == 0) {	// 초가 0일 경우, 초을 제외
			System.out.println(hour + "시간 " + min + "분 ");
		} else {
			System.out.println(hour + "시간 " + min + "분 " + sec + "초");
		}
	}
}
