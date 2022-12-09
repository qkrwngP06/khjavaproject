package com.kh.day13.iostream;

import java.io.File;
import java.io.IOException;

public class Exam_File {
	public static void main(String[] args) {
		File file = new File("C:\\Temp\\sea.jepg");
		String fileName = file.getName();
		String path = file.getPath();
		String parent = file.getParent();
		
		System.out.println("���� �̸� : " + fileName);
		System.out.println("���� ���: " + path);
		System.out.println("�θ� ����: " + parent);
		
		try {
			File fileMake = new File("src/iostream/fileOne.txt");
			File folderMake = new File("src/file");  //���� ����
			folderMake.mkdir();  
			File fileMake2 = new File("src/file/file.txt");
			fileMake2.createNewFile();
			//Unhandled exception type IOException
			fileMake.createNewFile();
			
			System.out.println("������ �����ϴ°�?: " + fileMake);
			System.out.println("FileOne.txt�� ������ �´°�?: " + fileMake.isFile());
			System.out.println("file������ ������ �´°�?: " + folderMake.isDirectory());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
