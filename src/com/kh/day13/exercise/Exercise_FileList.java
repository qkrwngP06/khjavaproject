package com.kh.day13.exercise;

import java.io.File;

public class Exercise_FileList {
	public static void listDirectory(File dir) {
		System.out.println("------" + dir.getPath() + "의 서브 리스트 입니다.------");
		File [] subFiles = dir.listFiles();
		for(int i = 0; i < subFiles.length; i++) {
			File fOne = subFiles[i];  //인덱스로 접근해서 딱 하나의 파일 객체만 fOne에다 넣어줌
			long time = fOne.lastModified();
			System.out.printf("%30s",fOne.getName());
			System.out.print("\t파일 크기: " + fOne.length());
			//월, 일, 요일, 시간
			System.out.printf("\t수정한 시간: %tb %td %ta %tT\n", time, time, time, time);
		}
	}
	
	public static void main(String[] args) {
		File f1 = new File("C:\\windows");
		System.out.println(f1.getPath() + ", " + f1.getParent() + ", " + f1.getName());
		listDirectory(f1);
	}

}
