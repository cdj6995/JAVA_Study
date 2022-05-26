package Boj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class number1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String word = sc.nextLine();
		word = word.toUpperCase();
		int flag = 0;
		
		String[] words  = word.split("");
		
				
		Set<String> set = new HashSet();		// 알파벳의 중복제거
		
		for(int i = 0; i < words.length; i++) {
			set.add(words[i]);
		}
		
		List<Integer> count = new ArrayList();	// 중복 제거된 알파벳들이 각각 몇번 나왔는지 배교하기 위해 리스트 생성
		
		for(String str : set) {
			int cnt = 0;
			for(int i = 0; i < words.length; i++) {
				if(str.equals(words[i])) {
					cnt++;
				}
			}
			count.add(cnt);
		}
		
		
		int max = Collections.max(count);			// 리스트안에 최댓값이 여러개 있는지 확인 여러개하면 바로 종료
		int maxCnt = 0;
		for(int i = 0; i < count.size(); i++) {
			if(max == count.get(i)) {
				maxCnt++;
				if(maxCnt > 1) {
					flag =1;
					break;
				}
			}
		}
		
		int maxindex = 0;
		int index = 0;
		if(flag == 1) {
			System.out.println("?");
		}else {
			for(int i = 0; i < count.size(); i++) {		// 리스트 안에 최댓값의 위치 찾기
				if(max == count.get(i)) { 
					maxindex = i;
					break;
				}
			}
			for(String str : set) {
				if(maxindex == index) {
					System.out.println(str);
					break;
				}else {
					index++;
				}
			}
		}
		
	}
}
