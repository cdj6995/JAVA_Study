package homework.day0325;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LottoUtil02_1 {
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
		List<Integer> number = new ArrayList<>();
		int[] lottoNum = new int[6];
		
		// 리스트에 첫번째 수 입력
		number.add((int) (Math.random()*45 + 1));
		
		// 서로다른 6개의 랜덤한 숫자 입력
		while(number.size() != 6) {
			int num = (int)(Math.random()*45) + 1;
			
			// 랜덤한 숫자가 리스트에 들어있는지 확인 => 들어 있다면 continue로 다시 while문 돈다
			if(number.contains(num))
				continue;

			// 리스트에 중복한 숫자가 없으면 그 수를 리스트에 추가
			number.add(num);	
		}
		
		// int배열에 각각의 숫자를 입력
		for(int i = 0; i < 6; i++) {
			lottoNum[i] = number.get(i);
		}
		
		return lottoNum;
	}
}
