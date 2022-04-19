package kr.ac.kopo.day07;

public class ConstructorMain02 {
	public static void main(String[] args) {
		
		Member m = new Member();
		Member m2 = new Member("홍길동", 10);
		Member m3 = new Member("홍길동", 10, "AB");
		
		m.info();
		m2.info();
		m3.info();
	}
}
