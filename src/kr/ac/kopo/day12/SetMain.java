package kr.ac.kopo.day12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
	Set : 순서(X), 중복(X)
	 - HashSet
	 - TreeSet
	 
	 
 */

public class SetMain {

	public static void main(String[] args) {
	
		Set<String> set = new HashSet<>();
		System.out.println("입력 성공 여부 : " + set.add("one"));
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		System.out.println("입력 성공 여부 : " + set.add("one"));	// 중복 허용X
		
		System.out.println("전체 원소의 개수 : " + set.size() + "개");
		
		/*
			전체 데이터 접근 방법 3가지
			1. 1.5버전 for문 이용
			2. toArray() 메소드 이용
			3. Iterator 객체 이용
		 */
		
		System.out.println(" < 1.5버전 for문 이용한 출력 > ");
		for(String str : set) {
			System.out.println(str);
		}
		
		System.out.println(" < toArray() 메소드를 이용한 출력 > ");
		Object[] arr = set.toArray();
		for(int i = 0; i < arr.length; i++) {
//			String a = (String)arr[i];		// i번째 문자열의 길이를 알고 싶으면 string으로 명시적 형변환 해줘야함 (object는 length가 없어서) 
			System.out.println(arr[i] + " : " + ((String)arr[i]).length());
		}
		System.out.println(Arrays.toString(arr));
		
		/*
			맨처음부터 맨 마지막까지의 데이터까지 접근 / 데이터 몇개인지는 몰라
			Iterator(순환객체) 주요 메소드
				- hasNext() : 데이터 존재여부를 판단(그 다음 데이터가 있니? 없니?) => true/false 반환
				- next()	: 데이터를 접근
		 */
		
		System.out.println(" < Iterator를 이용한 출력 > ");
		Iterator<String> ite= set.iterator(); 
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
	}
}
