package homework.day0322;

public class ShapeMain {

	public static void main(String[] args) {
		// 1~4 랜덤한 숫자 입력
		// 1-정사각형, 2-직사각형 3-삼각형, 4-원
		int type = ((int)(Math.random() * 10) % 4) +1;
		
		switch(type) {
		case 1:
			int n = (int) (Math.random() * 9) + 1;
			ShapeSquare 정사각형 = new ShapeSquare(n);
			정사각형.area();
			break;
		case 2:
			int x = (int) (Math.random() * 9) + 1;
			int y = (int) (Math.random() * 9) + 1;
			ShapeRectangle 직사각형 = new ShapeRectangle(x,y);
			직사각형.area();
			break;
		case 3:
			x = (int) (Math.random() * 9) + 1;
			y = (int) (Math.random() * 9) + 1;
			ShapeTriangle 삼각형 = new ShapeTriangle(x,y);
			삼각형.area();
			break;
		case 4:
			n = (int) (Math.random() * 9) + 1;
			ShapeCircle 원 = new ShapeCircle(n);
			원.area();
			break;
		}
	}
}
