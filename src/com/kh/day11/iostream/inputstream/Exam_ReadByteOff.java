package com.kh.day11.iostream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_ReadByteOff {
	public static void main(String [] args) {
		InputStream is = null;
		
		try {
			is = new FileInputStream("src/iostream/inputStream.txt");
			int readByteNo;
			byte [] readBytes = new byte[8];
			readByteNo = is.read(readBytes, 0, 3);  //숫자변경해보기!
			for(int i = 0; i < readBytes.length; i++) {
				System.out.print(readBytes[i]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
