package Boj;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class number2161 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		Queue<Integer> card = new LinkedList<>();
		
		for(int i = 0; i < n; i++) {
			card.offer(i+1);
		}
		
		while(true) {
			System.out.print(card.poll() + " ");
			if(card.isEmpty())
				break;
			card.offer(card.poll());	
		}
	}
}
