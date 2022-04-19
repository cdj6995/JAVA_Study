package kr.ac.kopo.day12;

public class Car {
	private String name;
	private String number;
	
	public Car() {}

	public Car(String name, String number) {
		this.name = name;
		this.number = number;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", number=" + number + "]";
	}
	
}
