package kr.ac.kopo.day09;

class A {
	A() {
		System.out.println("A() 호출...");
	}
}

class B extends A {
	B() {
		System.out.println("B() 호출...");
	}
}

class C extends B {
	C() {
		System.out.println("C() 호출...");
	}
}

public class ExtendMain02 {

	public static void main(String[] args) {
	
//		new A();	// A호출
//		new B();	// A호출, B호출
		new C();	// A호출, B호출, C호출
	}
}
