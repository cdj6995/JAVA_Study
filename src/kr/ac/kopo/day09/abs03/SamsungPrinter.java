package kr.ac.kopo.day09.abs03;

public class SamsungPrinter extends Printer {

	
	public SamsungPrinter() {}
	
	public SamsungPrinter(String model) {
		super(model);
	}
	
	@Override
	public void print() {
		System.out.println("SAMSUNG프린터에서 프린트 중...");
	}
	
	/*
	public void samPrint() {
		System.out.println("SAMSUMG프린터에서 출력합니다.");
	}
	*/
}
