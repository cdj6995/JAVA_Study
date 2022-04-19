package kr.ac.kopo.day08;

public class EmployeeMain {

	public static void main(String[] args) {
		
//		int totalEmployee = 0;
		
//		System.out.println("총 사원수 : " + Employee.employeeCnt + "명");
		Employee.employeeCntInfo();
		
		Employee e = new Employee("홍길동", 3300, "사원");
//		totalEmployee++;
		Employee e2 = new Employee("강길동", 3800, "대리");
//		totalEmployee++;
		
		e.info();
//		e.employeeCntInfo();
		e2.info();
		Employee.employeeCntInfo();
		
//		System.out.println("입사한 총 사원 수 : " + totalEmployee + "명");
	}
}
