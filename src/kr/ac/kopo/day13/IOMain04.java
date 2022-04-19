package kr.ac.kopo.day13;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import kr.ac.kopo.util.FileClose;

/*
 * Koala.jpg -> Koala2.jpg 복사
 */

public class IOMain04 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream("iotest/Koala.jpg");
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream("iotest/Koala3.jpg");
			bos = new BufferedOutputStream(fos);
			
			long start = System.currentTimeMillis();
			
			while(true) {				
				int c = bis.read();
				if(c == -1) break;
				bos.write(c);
			}
			
			fos.flush(); 	// 버퍼가 남아있을 수 있으므로 한번 밀어주는게 좋다.
			
			long end = System.currentTimeMillis();
			
			System.out.println("소요시간 : " + (end - start) / 1000. + "초");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(bis, fis);
			FileClose.close(bos, fos);
			
			// 매번 if~ try~ 쓰기 귀찮으니 클래스를 만들어서 메서드를 만들어서 사용
//			FileClose.close(bis);
//			FileClose.close(bos);
//			
//			FileClose.close(fis);
//			FileClose.close(bos);
		}
		
		/*	
		} finally {
			// 한 try문에 같이 쓰면안된다!
			if(bis != null) {				
				try {
					bis.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			if(bos != null) {				
				try {
					bos.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			if(fis != null) {				
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			if(fos != null) {				
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		*/
		System.out.println("파일 복사가 완료되었습니다.");
		
	} 
	
}
