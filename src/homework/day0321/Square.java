package homework.day0321;

public class Square {

	public static void square(int n) {
		System.out.println("정사각형의 면적은 " + n * n + " 입니다.");
	}
	public static void rectangle(int n, int m) {
		System.out.println("직사각형의 면적은 " + n * m + " 입니다.");
	}
	public static void triangle(int n, int m) {
		System.out.println("삼각형의 면적은 " + n * m * 0.5 + " 입니다.");
	}
	public static void circle(int n) {
		double PI = 3.14;
		System.out.println("원의 면적은 " + 2 * n * PI + "입니다.");
	}
	
}
