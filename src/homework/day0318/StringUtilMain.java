package homework.day0318;

public class StringUtilMain {
	public static void main(String[] args) {
		StringUtil stu = new StringUtil();
		
		char c = stu.getChar();			// 문자 입력
		int a = stu.getInt();			// 정수 입력
		int b = stu.getInt();			// 정수 입력		
		String str = stu.getString();	// 문자열 입력
		
		
		boolean result01 = stu.isUpperChar(c);
		boolean result02 = stu.isLowerChar(c);
		int result03 = stu.max(a,b);
		int result04 = stu.min(a,b);
		
		System.out.println(result01);
		System.out.println(result02);
		System.out.println(result03);
		System.out.println(result04);
		
		stu.reverseString(str);
		stu.toUpperString(str);
		stu.toLowerString(str);
		
	}

}
