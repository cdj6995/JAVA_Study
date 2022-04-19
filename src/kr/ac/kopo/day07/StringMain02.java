package kr.ac.kopo.day07;

public class StringMain02 {

	public static void main(String[] args) {
		
//		String str = "Hello";	
//		String str2 = "Hello";	같은 주소를 가리킴
		
		String str = new String("Hello");	
		String str2 = new String("HellO");	// 각자의 새로운 주소를 만듬
		
		// '=='은 주소값이 같냐고 물어보는거!! 즉, 주소비교
		if(str == str2) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		// equals()는 값비교
		if(str.equals(str2)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		// equalsIgnoreCase 대소문자 관계없이 문자 비교
		System.out.println(str.equalsIgnoreCase(str2));
		
		String[] names = {"홍길동","홍길순","홍길동","박길동","홍가네","윤길동","한길홍"};
		
		System.out.println(" < 전체이름이 홍길동인 사람 출력 > ");
		for(String name : names) {
			if(name.equals("홍길동")) {
				System.out.println(name);
			}
		}
		
		System.out.println(" < 성이 홍씨인 사람 출력 > ");
		for(String name : names) {
			if(name.startsWith("홍")) {
				System.out.println(name);
			}
		}
		
		System.out.println(" < 이름이 길동인 사람 출력 > ");
		for(String name : names) {
			if(name.endsWith("길동")) {
				System.out.println(name);
			}
		}
		
		System.out.println(" < 이름에 홍이 포함된 사람 출력 > ");
		for(String name : names) {
			if(name.contains("홍")) {
				System.out.println(name);
			}
		}
		
		str = "boat";
		str2 = "banana";
		int compare = str.compareTo(str2);
		if(compare == 0) {
			System.out.println("같다");
		} else if(compare > 0) {
			System.out.println("str이 더 뒤이 있다");
		} else {
			System.out.println("str이 더 앞에 있다");
		}
		
	}
}
