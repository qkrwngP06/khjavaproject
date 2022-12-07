package com.kh.day11.iostream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_WriteByte {
	public static void main(String[] args) {
		OutputStream os = null;
		//for�� ���� �迭�θ� �̿��ؼ�
		try {
			os = new FileOutputStream("src/iostream/outputStream.txt");
			byte [] data = "Real I/O".getBytes();  //�迭�� ����
			os.write(data);
			os.flush();  //Read�Ҷ��� �ʿ� ���µ� write�Ҷ��� �׻� ����������
			System.out.println("����Ϸ�!!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
