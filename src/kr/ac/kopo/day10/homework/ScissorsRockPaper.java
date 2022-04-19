package kr.ac.kopo.day10.homework;

public class ScissorsRockPaper implements Game {
	final static int SCISSOR = 1;
	final static int ROCK = 2;
	final static int PAPER = 3;
	
	@Override
	public int startGame(int you) {
		int me = (int)(Math.random() * 3) + 1;
		if( me == you) {
			System.out.println("비겼습니다.");
		}
		
		return 0;
		
		// 1 나오면 승리 카운트
	}
}
