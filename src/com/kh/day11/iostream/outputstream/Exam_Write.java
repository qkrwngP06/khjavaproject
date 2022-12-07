package com.kh.day11.iostream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_Write {

	public static void main(String[] args) {
		OutputStream os = null;
		
		try {
			//파일이 만들어짐
			os = new FileOutputStream("src/iostream/outputStream.txt");
			byte [] data = "Hello I/O".getBytes();  //int값으로 저장(문자에 있는 아스키 코드 값으로 바꿈)
			for(int i = 0; i < data.length; i++) {
				//System.out.print(data[i] + " ");
				os.write(data[i]);  //첫번째 글자 넣어줌
			}
			os.flush();  //버퍼라는 공간을 비워줘야함
			System.out.println("쓰기완료!!!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
