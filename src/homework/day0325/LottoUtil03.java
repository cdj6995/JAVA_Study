package homework.day0325;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LottoUtil03 {
	private Scanner sc = new Scanner(System.in);
	
	public void start() {
		System.out.print("게임 수 입력 : ");
		int totalcase = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < totalcase; i++) {
			System.out.printf("게임 %d : ", i+1);
			System.out.println(Arrays.toString(getNumbers()));
		}
	}
	
	private int[] getNumbers() {
		Set<Integer> number = new HashSet<>();
		int[] lottoNum = new int[6];
		
		// 서로다른 6개의 랜덤한 숫자 입력
		while(number.size() != 6) {
			number.add((int)(Math.random()*45) + 1);
		}
		
		// set을 배열로 변환
		Object[] lotto = number.toArray();
		
		// int배열에 각각의 숫자를 입력
		for(int i = 0; i < 6; i++) {
			lottoNum[i] = (int)lotto[i];
		}
		
		return lottoNum;
	}
}
