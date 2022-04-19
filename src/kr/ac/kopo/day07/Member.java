package kr.ac.kopo.day07;

public class Member {
	// 멤버변수
	String name;
	int age;
	String bloodType;
	
	// 생성자
	Member(){
		this("알수없음");
	}
	
	Member(String name){
		this(name, -1);
	}
	
	Member(String name, int age){
		this(name, age, "알수없음");
	}
	
	Member(String name, int age, String bloodType){
		this.name = name;
		this.age= age;
		this.bloodType = bloodType;
	}

	// 메소드
	void info() {
		System.out.println("이름 : " + name + ", 나이 : " + age
				+ ", 혈액형 : " + bloodType);	
	}
}

/*
public class Member {
	// 멤버변수
	String name;
	int age = -1;
	String bloodType = "모름";
	
	// 생성자
	Member(){
		this("알수없음", -1, "알수없음");
//		this.name = "알수없음";
//		this.age = -1;
//		this.bloodType = "알수없음";
	}
	
	Member(String name, int age){
		this(name, age, "알수없음"); // 다른 생성자 호출
//		this.name = name;
//		this.age = age;
//		this.bloodType = "알수없음";
	}
	
	Member(String name, int age, String bloodType){
		this.name = name;
		this.age= age;
		this.bloodType = bloodType;
	}
	
	// 메소드
	void info() {
		System.out.println("이름 : " + name
				+ ", 나이 : " + age
				+ ", 혈액형 : " + bloodType);	
	}
}
*/