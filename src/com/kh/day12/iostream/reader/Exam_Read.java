package com.kh.day12.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class Exam_Read {
	public static void main(String[] args) {
		// ����Ʈ ��� ��Ʈ��
		InputStream is = null;
		// ���� ��� ��Ʈ��(�ѹ��ھ� ����/���ڴ���!!)
		Reader reader = null;
		// Unhandled exception type FileNotFoundException
		try {
			reader = new FileReader("src/iostream/filereader.txt"); // ��ĳ����
			while (true) {
				// Unhandled exception type IOException
				int readData = reader.read(); // reader.read();���ϸ��� �Է°� ����� -> �������� �־���
				if (readData == -1)
					break; // ������ ������ �׸� ����!!
				System.out.print((char) readData); // readData�� ���ָ� 65(A), (char)readData ����ȯ A ���
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// �ݵ�� ����Ǿ�� �ϴ� �ڵ� �ۼ�
			// ����� �ý��� �ڿ��� �ݳ��ϰ� ��Ʈ���� ����
			//Unhandled exception type IOException
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
