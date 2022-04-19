package homework.day0325;

import java.util.Arrays;
import java.util.Scanner;

public class LottoUtil01 {
	Scanner sc = new Scanner(System.in);
	
	public void start() {
		System.out.print("게임 수 입력 : ");
		int totalcase = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < totalcase; i++) {
			System.out.printf("게임%d : ", i+1);
			System.out.println(Arrays.toString(getNumbers()));
		}
	}
	
	private int[] getNumbers() {
		int[] lottoNum = new int[6];
		
		loop: for(int i = 0; i < 6; i++) {
			int num = (int)(Math.random() * 45) + 1;
			// 현재의 랜덤한 숫자가 들어있는지 확인
			for(int j = 0; j <= i; j++) {
				if(num == lottoNum[j]) {
					i--;	// 같은 숫자가 발견되면 continue에 의해 i가 한번 더해지는데 i를 그대로 유지하고자 i--를 해줌 
					continue loop;
				}
			}
			lottoNum[i] = num;
		}
		
		return lottoNum;
	}
}
