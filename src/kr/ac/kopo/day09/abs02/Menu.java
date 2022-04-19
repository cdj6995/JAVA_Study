package kr.ac.kopo.day09.abs02;

import java.util.Scanner;

public class Menu {

	private Scanner sc = new Scanner(System.in);
	
	// 외부에 드러내고 싶지도 드러낼 필요도 없을 경우 private(class내에서만 사용)사용, 자식도 사용x
	private String select() {	
		System.out.print("프린터를 선택하세요(1.LG 2.SAMSUNG 3.HP) => ");
		String type = sc.nextLine();
		return type;
	}
	
	private void print(String type) {
		Printer p = null;
		switch(type) {
		case "1":
			p = new LGPrinter();
			break;
		case "2":
			p = new SamsungPrinter();
			break;
		case "3":
			p = new HPPrinter();
			break;
		}
		if(p != null) {
			p.print();
		}
	}
	
	/*
	public void print(String type) {
		switch(type) {
		case "1":
			LGPrinter lg = new LGPrinter();
			lg.print();
			break;
		case "2":
			SamsungPrinter sam = new SamsungPrinter();
			sam.print();
			break;
		case "3":
			HPPrinter hp = new HPPrinter();
			hp.print();
//			hp.hpPrint();
			break;
		}
	}
	*/
	
	public void process() {
		String type = select();
		print(type);
	}
}
