package homework.day0325;

public class LottoMain {

	public static void main(String[] args) {
		LottoUtil01 lotto1 = new LottoUtil01();
		LottoUtil02 lotto2 = new LottoUtil02();
		LottoUtil02_1 lotto2_1 = new LottoUtil02_1();
		LottoUtil03 lotto3 = new LottoUtil03();
		LottoUtil04 lotto4 = new LottoUtil04();
		
		System.out.println(" < 로또 게임을 시작합니다. > ");
		lotto1.start();		// int배열 
		lotto2.start();		// List
		lotto2_1.start();	// List
		lotto3.start();		// Set
		lotto4.start();		// Map
	}
}
