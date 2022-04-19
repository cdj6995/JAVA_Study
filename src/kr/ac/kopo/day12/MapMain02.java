package kr.ac.kopo.day12;

import java.util.HashMap;
import java.util.Map;

public class MapMain02 {

	public static void main(String[] args) {
	
		Map<Member, Car> map = new HashMap<>();
		
		map.put(new Member("홍길동", "010-1111-2222"), new Car("소나타", "33가 3333"));
		map.put(new Member("윤길동", "010-3333-4444"), new Car("K5", "55나 5555"));
		// 홍길동 차량 정보 변경
		map.put(new Member("홍길동", "010-1111-2222"), new Car("카니발", "22다 1212"));

		
		System.out.println("총 개수 : " + map.size());
		System.out.println(new Member("홍길동", "010-1111-2222").hashCode());
		System.out.println(new Member("홍길동", "010-1111-2222").hashCode());
		
		
		
		
		/*
		Set<Entry<Member, Car>> entrys = map.entrySet();
		for(Entry<Member, Car> data : entrys) {
			Member member = data.getKey();
			Car car = data.getValue();
			System.out.println(member);
			System.out.println(car);
			
		}
		*/
	}
}
