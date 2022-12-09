package com.kh.day12.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Scanner;

public class Exercise_IOStream {
	public void fileCopy(){
		//�̹��� ���� ����
		//����Ʈ ��� �Է½�Ʈ��
		InputStream is = null;
		OutputStream os = null;
		
		try {
			is = new FileInputStream("C:\\Users\\samsung\\OneDrive\\���� ȭ��\\img\\sea.jpeg");
			os = new FileOutputStream("C:\\Users\\samsung\\OneDrive\\����\\ī�޶� �ٹ�\\sea.jpeg");
			byte [] readBytes = new byte[100];
			int readByteNo;
			while((readByteNo = is.read(readBytes)) != -1){  //���� �б� ����
				os.write(readBytes, 0, readByteNo);
			}
			System.out.println("���簡 �Ϸ�Ǿ����ϴ�.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void memoFileMake() {
		/*
		 * ������ ���ϸ� �Է�: khtext.txt
		 * 'khtext.txt' ���Ͽ� ����� ���� �Է�:
		 * ����� exit
		 * 1. 1111
		 * 2. text input
		 * 3. good
		 * 4. gogogo
		 * 5. exit
		 * ���� ���� �Ϸ�(exit�� �����ϰ� ����)
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ���ϸ� �Է�: ");
		//���� ���� -> ���� ����°� ��Ʈ������ ��� ����?
		String fileName = sc.next();
		Writer writer = null;
		
		try {
			writer = new FileWriter("src/iostream/" + fileName);
			System.out.println("'"+fileName+"' ���Ͽ� ����� ���� �Է�:");
			System.out.println("����� exit");
			sc.nextLine();
			//for(int i = 0; i <= 5; i++) 
			int i = 1;
			while(true) {
				System.out.print(i + " : ");
				String input = sc.nextLine() + "\n";
				if("exit\n".equals(input)) break;
				/*
				if("exit".equals(input))
				writer.write(input + "\n");*/
				//if("exit".contains(input.trim())) break;  //trim() ��������
				writer.write(input);
				i++;
			}
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
