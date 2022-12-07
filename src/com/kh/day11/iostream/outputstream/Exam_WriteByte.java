package com.kh.day11.iostream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_WriteByte {
	public static void main(String[] args) {
		OutputStream os = null;
		//for문 없이 배열로만 이용해서
		try {
			os = new FileOutputStream("src/iostream/outputStream.txt");
			byte [] data = "Real I/O".getBytes();  //배열로 받음
			os.write(data);
			os.flush();  //Read할때는 필요 없는데 write할때는 항상 사용해줘야함
			System.out.println("쓰기완료!!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
