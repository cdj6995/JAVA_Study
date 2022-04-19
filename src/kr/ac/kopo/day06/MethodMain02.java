package kr.ac.kopo.day06;

class Method {
	// 메소드 오버로딩(overloading) => 같은 클래스내에서 메소드명이 같으면서 매개변수의 개수나 타입이 서로 다른 것
	void call() {
		System.out.println("call() 메소드 호출...");
	}
	
	// 같은 매개변수명이 있어도 매개변수 타입이나 이름, 개수가 다르면 가능
	void call(int i) {
		System.out.println("call(int) 메소드 호출...");
	}
	
	void call(double i) {
		System.out.println("call(double) 메소드 호출...");
	}
	
	void call(boolean i) {
		System.out.println("call(boolean) 메소드 호출...");
	}
	
	void call(String str, int i) {
		System.out.println("call(String, int) 메소드 호출...");
	}
}


public class MethodMain02 {
	public static void main(String[] args) {
//		Math.random();	// java.lang패키지에서 Math 클래스의 random 매소드
//		Scanner sc = new Scanner(System.in);	// 매소드인가? 클래스인가?
		
		Method m = new Method();
		m.call();
		m.call(10);
		m.call(10.0);
		m.call(true);
		m.call("hello", 10);
		
	}

}
