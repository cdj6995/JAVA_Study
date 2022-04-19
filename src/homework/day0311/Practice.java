package homework.day0311;

import java.util.Scanner;


public class Practice {
	
	public static void main(String[] args) {
		
		// 모래시계
		
		int col = (int)(Math.random()*10) + 3;
		if(col % 2 == 0) {
			col++;
		}
		
		int star = 1;
		for(int i = 1; i <= col; i++) {
			
			for(int j = 1; j <= col; j++) {
				if(j >= star && j <= col+1-star ) {
					System.out.print("*");
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
			if(i < col/2 + 1) {
				star++;
			} else {
				star--;
			}
		}
		
		// 마름모
		
		// 행의 개수를 랜덤으로 추출
		
		/*
		int line = (int)(Math.random()*10) + 3;
		
		if(line % 2 == 0) {
			line++;
		}
		
		int star = 1;
		int mid = line/2 + 1;
		
		for(int i = 1; i <= line; i++) {
			
			for(int j = 1; j <= line; j++) {
				if(j <= mid-star || j >= mid+star) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
			if(i < mid) {
				star++;
			} else {
				star--;
			}
		} */
		
	}
}
