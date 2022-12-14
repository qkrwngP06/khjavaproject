package com.kh.day12.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_ReadChar {
	public static void main(String[] args) {
		Reader reader = null;
		
		try {
			reader = new FileReader("src/iostream/filereader.txt");
			int readCharNo;
			char [] cbuf = new char[2]; //2개씩 읽어라
			String data = "";
			while(true) {
				readCharNo = reader.read(cbuf);  //읽은 건 cbuf에 들어감 , 읽은 갯수는 readCharNo에 들어감
				if(readCharNo == -1) break;
				data += new String(cbuf, 0, readCharNo); //문자배열을 String으로 바꿔줌, += 누적해줌
			}
			//data cannot be resolved to a variable
			//Unreachable code
			System.out.println(data);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
