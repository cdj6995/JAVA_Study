package homework.day0322;

public class ShapeSquare extends ShapeRectangle {

	private int n;
	
	public ShapeSquare() {}
	public ShapeSquare(int n) {
		this.n = n;
	}
	
	@Override
	public void area() {
		System.out.println("정사각형의 면적은 " + (n * n) + " 입니다.");
	}
	
}
