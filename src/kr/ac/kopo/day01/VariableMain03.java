package kr.ac.kopo.day01;

public class VariableMain03 {
	
	public static void main(String[] args) {
		
		int a;
		byte b = 10;
		
		a = b;
		b = (byte)a;
		
		System.out.println(10 + 20);
		System.out.println(10 + 20.0);
		System.out.println(10 + (int)20.0);
		
		double d = 10 + 20.2;
		int e = (int)(10 + 20.2);
		System.out.println(d);
		System.out.println(e);
		
		int num = 100;
		System.out.println("num = " + num);
		num = 20;
		System.out.println("num = " + num);
		
		final int NUM = 100;	// final 붙어있는 변수는 대문자로 쓴다 => 이거슨 상수변수다.
		System.out.println("num = " + NUM);
//		double aaa = Math.PI*10;
		
		char ch = '!';
		ch = '\'';
		System.out.println(ch);
		
	}
}
