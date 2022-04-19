package kr.ac.kopo.day13;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {

		File dirobj = new File("iotest");
		if(dirobj.exists()) {
			
			File[] list = dirobj.listFiles();
			for(File f : list) {
				System.out.print(f.getName());
				System.out.print(f.isDirectory() ? "<디렉토리>\n" : "<파일>\n");
			}
			
//			String[] list = dirobj.list();
//			for(String data : list) {
//				System.out.println(data);
//				File fileobj = new File(dirobj.getName() + "/" + data);
//				System.out.println(fileobj.isDirectory() ? "디렉토리" : "파일");
//			}
//			System.out.println(Arrays.toString(list));
		}
		
		
		
		/* 
		File dirobj = new File("iotest/강아지/리트리버");
		System.out.println("존재 여부 : " + dirobj.exists());
		
		System.out.println("디렉토리 여부 : "+ dirobj.isDirectory());
		System.out.println("파일 여부 : "+ dirobj.isFile());
		
		if(!dirobj.exists()) {
			dirobj.mkdirs();		// mkdir : 마지막 위치의 것만 만든다. / mkdirs : 마지막 뿐만 아니라 그 상위 도 없으면 다 만든다
		}
		 */
		
		
		/*
		File fileobj = new File("iotest/a.txt");
		String filename = fileobj.getName();
		String parent = fileobj.getParent();
		
		System.out.println("파일명 : " + filename);
		System.out.println("부모 : " + parent);
		
		System.out.println("파일 존재 여부 : " + fileobj.exists());
		
		long filesize = fileobj.length();	// 파일크기 확인
		System.out.println("파일의 크기 : " + filesize + "byte(s)");
		
		System.out.println(fileobj.canRead() ?  "읽기 가능" : "읽기 불가능");
		System.out.println(fileobj.canWrite() ? "쓰기 가능" : "쓰기 불가능");
		
		long lastTime = fileobj.lastModified();
		String pattern = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println("마지막 수정 시간 : " + sdf.format(new Date(lastTime)));
		 */
		
	}
}
