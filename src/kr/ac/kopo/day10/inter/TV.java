package kr.ac.kopo.day10.inter;

public interface TV {

	public static final int MIN_VOLUME_SIZE = 0;
	int MAX_VOLUME_SIZE = 50;
	
	/**
	 * 전원을 켜는 기능
	 */
	public abstract void powerOn();
	void powerOff();
	void channerlUp();
	void channerlDown();
	void volumeUp();
	void volumeDown();
	void mute();
	
}
