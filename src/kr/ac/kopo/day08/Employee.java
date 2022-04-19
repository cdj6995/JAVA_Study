package kr.ac.kopo.day08;

public class Employee {

	String 	name;	// 이름
	int		salary;	// 연봉
	String 	grade;	// 직급
	static int employeeCnt;		// 총 사원수
	
	
	Employee(){
		employeeCnt++;
	}	//기본생성자
	
	Employee(String name, int salary, String grade){
		this.name = name;
		this.salary = salary;
		this.grade = grade;
		employeeCnt++;
	}
	
	void info() {
		System.out.println("사원명 : " + name + ", 연봉 : " + salary
				+ ", 직급 : " + grade);
	}
	
	static void employeeCntInfo() {
		System.out.println("총 사원수 : " + Employee.employeeCnt + "명");
	}
	
}
