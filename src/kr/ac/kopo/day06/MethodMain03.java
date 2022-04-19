package kr.ac.kopo.day06;

class ExamMethod {
	
	int getSum(int a, int b) {
		return a+b;
	}
	
	int getTotal(int a, int b) {
		int s = 0;
		while(a <= b) {
			s += a++;
		}
		return s;
	}
}


public class MethodMain03 {
	public static void main(String[] args) {
		
		// 같은 패키지 안의 클래스는(import없이) 서로 사용가능
//		Method m = new Method();
//		m.call();
		
		// getSum 메소드 사용
		ExamMethod exam = new ExamMethod();
		int sum = exam.getSum(10,20);
		System.out.println("10 + 20 = " + sum);
		
		// getTotal 메소드 사용
		System.out.println(exam.getTotal(1, 10));
		
		
	}

}
