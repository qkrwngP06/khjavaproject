package com.kh.day12.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class Exam_Read {
	public static void main(String[] args) {
		// 바이트 기반 스트림
		InputStream is = null;
		// 문자 기반 스트림(한문자씩 읽음/문자단위!!)
		Reader reader = null;
		// Unhandled exception type FileNotFoundException
		try {
			reader = new FileReader("src/iostream/filereader.txt"); // 업캐스팅
			while (true) {
				// Unhandled exception type IOException
				int readData = reader.read(); // reader.read();만하면은 입력값 사라짐 -> 변수에다 넣어줌
				if (readData == -1)
					break; // 읽을게 없으면 그만 멈춰!!
				System.out.print((char) readData); // readData만 해주면 65(A), (char)readData 형변환 A 출력
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 반드시 실행되어야 하는 코드 작성
			// 사용한 시스템 자원을 반납하고 스트림을 닫음
			//Unhandled exception type IOException
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
