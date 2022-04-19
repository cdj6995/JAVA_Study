package kr.ac.kopo.day02;

public class OperationMain03 {
	public static void main(String[] args) {
		
		int a = 10, b = 5;
		
		int max = (a > b) ? a : a < b ? b : 0;
		System.out.println("max : " + max);
	}
}
