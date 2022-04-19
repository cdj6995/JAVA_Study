package homework.day0310;

public class problem06 {
	public static void main(String[] args) {
		
		// 대문자 갯수 계산
		int large = (int)'Z' - (int)'A' + 1;
		
		// 소문자 갯수 계산
		int small = (int)'z' - (int)'a' + 1;
		
		System.out.println("개수 ? " + (large + small));
	}
}
