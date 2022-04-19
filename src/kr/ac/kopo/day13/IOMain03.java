package kr.ac.kopo.day13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * Koala.jpg -> Koala2.jpg 복사
 */

public class IOMain03 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("iotest/Koala.jpg");
			fos = new FileOutputStream("iotest/Koala2.jpg");
			
			long start = System.currentTimeMillis();
			
			while(true) {				
				int c = fis.read();
				if(c == -1) break;
				fos.write(c);
			}
			
			fos.flush(); 	// 버퍼가 남아있을 수 있으므로 한번 밀어주는게 좋다.
			
			long end = System.currentTimeMillis();
			
			System.out.println("소요시간 : " + (end - start) / 1000. + "초");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 한 try문에 같이 쓰면안된다!
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("파일 복사가 완료되었습니다.");
		
	} 
	
}
