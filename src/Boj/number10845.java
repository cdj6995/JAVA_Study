package Boj;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class number10845 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		Qqueue que = new Qqueue();
		
		for(int i = 0; i < n; i++) {
			String input = sc.nextLine();
			String[] str = input.split(" ");
			
			if(str[0].equals("push")) {
				que.push(Integer.parseInt(str[1]));
			}else if(str[0].equals("pop")) {
				que.pop();
			}else if(str[0].equals("size")) {
				que.size();
			}else if(str[0].equals("empty")) {
				que.empty();
			}else if(str[0].equals("front")) {
				que.front();
			}else if(str[0].equals("back")) {
				que.back();
			}
		}
		
		que.printans();		
	}
}


class Qqueue {
	Queue<Integer> queue = new LinkedList<>();
	StringBuilder answer = new StringBuilder();
	int last = 0;
	
	public void push(int n) {
		queue.offer(n);
		last = n;
	}
	
	public void pop() {
		if(queue.isEmpty())
			answer.append("-1\n");
		else
			answer.append(queue.poll()+ "\n");
	}
	
	public void size() {
		answer.append(queue.size() + "\n");
	}
	
	public void empty() {
		if(queue.isEmpty())
			answer.append("1\n");
		else
			answer.append("0\n");
	}
	
	public void front() {
		if(queue.isEmpty())
			answer.append("-1\n");
		else
			answer.append(queue.peek() + "\n");
	}
	
	public void back() {
		if(queue.isEmpty())
			answer.append("-1\n");
		else
			answer.append(last + "\n");
	}
	
	public void printans() {
		System.out.println(answer);
	}
}