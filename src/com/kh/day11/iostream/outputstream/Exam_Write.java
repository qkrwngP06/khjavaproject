package com.kh.day11.iostream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_Write {

	public static void main(String[] args) {
		OutputStream os = null;
		
		try {
			//������ �������
			os = new FileOutputStream("src/iostream/outputStream.txt");
			byte [] data = "Hello I/O".getBytes();  //int������ ����(���ڿ� �ִ� �ƽ�Ű �ڵ� ������ �ٲ�)
			for(int i = 0; i < data.length; i++) {
				//System.out.print(data[i] + " ");
				os.write(data[i]);  //ù��° ���� �־���
			}
			os.flush();  //���۶�� ������ ��������
			System.out.println("����Ϸ�!!!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
