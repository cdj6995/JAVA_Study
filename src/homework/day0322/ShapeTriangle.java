package homework.day0322;

public class ShapeTriangle extends Shape {

	private int x;
	private int y;
	
	public ShapeTriangle() {}
	public ShapeTriangle(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void area() {
		System.out.println("삼각형의 면적은 " + (x * y / 2) + " 입니다.");
	}
}
