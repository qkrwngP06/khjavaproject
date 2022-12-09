package com.kh.day12.iostream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_Write {
	public static void main(String[] args) {
		Writer writer = null;  //추상클래스
		
		try {
			writer = new FileWriter("src/iostream/filewriter.txt");  //출력 나감 파일이 없으면 파일을 만들어줌
			char [] data = "스프링&클라우드 웹 개발자 양성과정".toCharArray();  //문자배열로 만들어줌
			for(int i = 0; i < data.length; i++) {
				writer.write(data[i]);
			}
			writer.flush();  //버퍼 비움(강제로 비움)
			System.out.println("쓰기 완료!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
