package homework.day0325;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class LottoUtil04 {
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
		Map<Integer, Integer> number = new HashMap<>();
		int[] lottoNum = new int[6];
		
		// Map의 key값은 중복 허용(X), value값은 아무값이나 입력
		while(number.size() != 6) {
			number.put((int)(Math.random() * 45) + 1, 0);
		}
		
		// 키값들로 새로운 set생성
		Set<Integer> num = number.keySet();
		
		int loc = 0;
		for(Integer n : num) {
			lottoNum[loc++] = n;
		}
		
		return lottoNum;
	}
}
