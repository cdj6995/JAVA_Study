package kr.ac.kopo.day10.inter;

public class UserMain {

	public static void main(String[] args) {
		
		TV tv = new LGTV();
//		TV tv = new SamsungTV();
		tv.powerOn();
		tv.channerlDown();
		tv.volumeUp();
		tv.channerlUp();
		tv.channerlUp();
		tv.powerOff();
	}
}
