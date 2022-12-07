package com.kh.day11.iostream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_Read {
	public static void main(String [] args) {
		//Cannot instantiate the type InputStream
		//InputStream is = new InputStream();  //객체화 불가(추상클래스기 때문에)
		InputStream is = null;
		
		//Unhandled exception type FileNotFoundException -> Checked Exception
		//->반드시 try ~ catch 해줘야 하는 Exception
		//is = new FileInputStream("");
		try {
			is = new FileInputStream("src/iostream/inputStream.txt");
			//Unhandled exception type IOException
			int readByte;
			while(true) {
				readByte = is.read();
				//없으면 그만 읽어!!
				if(readByte == -1) break;
				//Unreachable code
				System.out.print((char)readByte);
			}
			/*
			for(int i = 0; i < 4; i++) {
				readByte = is.read();
				System.out.print((char)readByte);
			}*/
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
