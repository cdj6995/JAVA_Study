package homework.day0321;

public class SquareMain {

	public static void main(String[] args) {
		// 1~4 랜덤한 숫자 입력
		// 1-정사각형, 2-직사각형 3-삼각형, 4-원
		int type = ((int)(Math.random() * 10) % 4) +1;
		
		switch(type) {
		case 1:
			int n = (int) (Math.random() * 9) + 1;
			Square.square(n);
			break;
		case 2:
			int n1 = (int) (Math.random() * 9) + 1;
			int m1 = (int) (Math.random() * 9) + 1;
			Square.rectangle(n1, m1);
			break;
		case 3:
			int n2 = (int) (Math.random() * 9) + 1;
			int m2 = (int) (Math.random() * 9) + 1;
			Square.triangle(n2, m2);
			break;
		case 4:
			int n3 = (int) (Math.random() * 9) + 1;
			Square.circle(n3);
			break;
		}
		
	}
}
