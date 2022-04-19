package kr.ac.kopo.day01;

public class PrintMain02 {

	/*
	 	ASCII CODE(0 ~ 256) : 1byte
	 		대문자, 소문자, 숫자, ...
	 		
	 	UNICODE(0 ~ 65500) : 2byte
	 		다국어 진원 숫자표(ASCII CODE + 한글, 한자, ...)
	 		자바의 문자 인식
	 	
	 	'A' : 65	=>(16진수) 	0x41
	 	'a' : 97				0x61
	 	'0' : 48				0x30
	 */
	
	public static void main(String[] args) {
		System.out.println('A');
		System.out.println('A' + "ABC");
		System.out.println('A' + 'B');
		System.out.println('A' + 10);
		System.out.println(0x41);
		System.out.println();
	}
}
