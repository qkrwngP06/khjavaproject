package com.kh.day11.iostream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_ReadByte {
	public static void main(String[] args) {
		InputStream is = null;
		
		try {
			is = new FileInputStream("src/iostream/inputStream.txt");    //��ĳ����
			int readByteNo;
			byte [] readBytes = new byte[3];  //���� ���� ���� ���: 3
			String data = "";	
			while(true) {
				readByteNo = is.read(readBytes);  //�������� ������ ����
				if(readByteNo == -1) break;  //���������� �о�!!
				data += new String(readBytes, 0 , readByteNo);  // ������ ����
			}
			/*
			while((readByteNo = is.read(readBytes)) != -1) {
				data += new String(readBytes, 0 , readByteNo);  // ������ ����
			}*/
			System.out.println(data); //����ؼ� ��!
			System.out.println(readByteNo);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}  
	}

}