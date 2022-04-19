package homework.day0322;

public class ShapeRectangle extends Shape {

	private int x;
	private int y;
	
	public ShapeRectangle() {}
	public ShapeRectangle(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void area() {
		System.out.println("직사각형의 면적은 " + (x * y) + " 입니다.");
	}
	
}
