package kr.ac.kopo.day11;

import java.util.LinkedList;
import java.util.List;

/*
 	List : 순서 O, 중복 O
 	 - ArrayList
 	 - LinkedList
 	 
 	 add()
 	 get()
 	 size()
 	 remove()
 	 isEmpty()
 	 contains()
 	 clear()
 	 addAll()
 */


public class ListMain {

	public static void main(String[] args) {
//		List<Integer> list = new ArrayList<Integer>();	// 정수의 배열을 만들고 싶으면 int가 아닌 Integer사용 => 그이유는 참조자료형만 들어갈 수 있기 때문
//		list.add(10);
		
//		List<String> list = new ArrayList<String>();
//		List<String> list = new ArrayList<>();			// new쪽 <>에 생략 가능
		List<String> list = new LinkedList<>();			// ArrayList -> LinkedList로 바꿔도 똑같다(명령어 같고~ 등등...)
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("one");
		
		System.out.println("전체 원소의 개수 : " + list.size() + "개");
		
		System.out.println("< PRINT >");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("\"one\" 삭제 : " + (list.remove("one") ? "성공" : "실패"));
		System.out.println("\"one\" 삭제 : " + (list.remove("one") ? "성공" : "실패"));
		System.out.println("\"one\" 삭제 : " + (list.remove("one") ? "성공" : "실패"));
		
		
		System.out.println("< 1.5 Version >");
		for(String str : list) {
			System.out.println(str);
		}
		
		System.out.println("0번지에 위치한 문자열 삭제 : " + list.remove(0));
		
	}
	
}
