package kr.ac.kopo.day02;

public class SwitchMain02 {

	public static void main(String[] args) {

		/*
		String a = new String("Hello");
				
		System.out.println(a == "Hello");	// false, 문자열은 동등비교(==) 쓸 수 없다.
		System.out.println(a.equals("Hello")); // true
		*/
		
		String str = new String("Hello");
		switch(str) {
		case "Hello":
			System.out.println("True");
		default:
			System.out.println("False");
		}
		
		
	}
}
