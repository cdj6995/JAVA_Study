package homework.day0322;

public class ShapeCircle extends Shape{
	private double Pi = 3.14;
	private int r;
	
	public ShapeCircle() {}
	
	public ShapeCircle(int r) {
		this.r = r;
	}
	
	@Override
	public void area() {
		System.out.println("원의 면적은 " + (r * r * Pi) + "입니다.");
	}
}
