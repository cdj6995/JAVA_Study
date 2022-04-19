package Boj;

import java.util.Scanner;
import java.util.Stack;

public class number10828 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
//		SStack stack = new SStack();
		Stack<Integer> stack = new Stack<>();
		StringBuilder answer = new StringBuilder();
		
		
		for(int i = 0; i < n; i++) {
			String str = sc.nextLine();
			String[] st = str.split(" ");
			
			if(st[0].equals("push")) {
				stack.push(Integer.parseInt(st[1]));
			}else if(st[0].equals("pop")) {
				if(stack.empty()) answer.append("-1\n"); 
				else answer.append(stack.pop()+"\n");
			}else if(st[0].equals("size")) {
				answer.append(stack.size()+"\n");
			}else if(st[0].equals("empty")) {
				if(stack.empty()) answer.append("1\n");
				else answer.append("0\n");
			}else if(st[0].equals("top")) {
				if(stack.empty()) answer.append("-1\n");
				else answer.append(stack.peek()+"\n");
			}
		}
		
		System.out.println(answer);
	}
}



//class SStack{
//	Stack<Integer> stack = new Stack<>();
//	
//	public void push(int n) {
//		stack.push(n);
//	}
//	public void pop() {
//		if(stack.empty())
//			System.out.println(-1);
//		else
//			System.out.println(stack.pop());
//	}
//	
//	public void size() {
//		System.out.println(stack.size());
//	}
//	public void empty() {
//		if(stack.empty())
//			System.out.println(1);
//		else
//			System.out.println(0);
//	}
//	public void top() {
//		if(stack.empty())
//			System.out.println(-1);
//		else
//			System.out.println(stack.peek());
//	}
//}