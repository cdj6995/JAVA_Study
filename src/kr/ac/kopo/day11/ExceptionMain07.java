package kr.ac.kopo.day11;

import java.io.FileReader;

public class ExceptionMain07 {

	public static void main(String[] args) {
	
		try {
			c();
			d();
			e();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		try {
			b();
		} catch(Exception e) {
			e.printStackTrace();
		}
		a();
	}
	
	
	public static void f() throws Exception{
		
	}
	public static void c() throws Exception{
		f();
	}
	public static void d() throws Exception{
		
	}
	public static void e() throws Exception{
		
	}
	
	public static void b() throws Exception {
		int[] arr = new int[3];
		System.out.println(arr[4]);
		FileReader fr = new FileReader("a.txt");
	}
	
	public static void a() {
		try {
			String str = null;
			System.out.println(str.length());
		} catch(Exception e) {
			System.out.println("예외발생 : " + e.getMessage());
		}
	}	
}
