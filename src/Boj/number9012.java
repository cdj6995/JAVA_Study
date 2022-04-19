package Boj;

import java.util.Scanner;
import java.util.Stack;

public class number9012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < test; i++) {
			String ps = sc.nextLine();
			String[] PS = ps.split("");
			
			Stack<String> stack = new Stack<>();
			
			int flag = 0;
			for(int j = 0; j < PS.length; j++) {
				if(PS[j].equals("(")) {
					stack.push(PS[j]);
				}else if(PS[j].equals(")")) {
					if(stack.empty()) {
						flag = 1;
						break;
					}else {
						stack.pop();
					}
				}
			}
			if(!stack.empty())
				flag = 1;
			
			if(flag == 0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
