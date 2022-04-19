package homework.day0321;

public class StringUtilMain {
	public static void main(String[] args) {
		StringUtil stu = new StringUtil();
		
		// 문자열 개수 출력
		String strData = stu.getString();	// 문자열 입력
		char ch = stu.getChar();			// 문자 입력
		
		int cnt = StringUtil.checkChar(strData, ch);
		System.out.println(cnt);

		// 문자열 제거 출력
		String oriStr = stu.getString();	// 문자열 입력
		char delChar = stu.getChar();			// 문자 입력
		
		String result = StringUtil.removeChar(oriStr, delChar);
		System.out.println(result);
	}

}
