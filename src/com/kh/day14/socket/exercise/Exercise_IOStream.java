package com.kh.day14.socket.exercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise_IOStream {
	//���������α׷��� ->��ü�������� �ٲ㺸��
	
	// �ص��ǰ� ���ص���(����)
	// 1. �����Է�
	// 2. �������
	// 3. ��������(save) ->���Ͽ� ����
	// 4. ���� �ҷ�����(load)
	// 0. ����
	// �޴� �Է�: 1

	// �̸� �Է�: �Ͽ���
	// ���� �Է�: 33
	// �ּ� �Է�: ����� ���α�

	// 1. �����Է�
	// 2. �������
	// 3. ��������(save)
	// 4. ���� �ҷ�����(load)
	// 0. ����
	// �޴� �Է�: 2

	// �̸� : �Ͽ���
	// ���� : 33
	// �ּ�: ����� ���α�

	// 3 �����Ͽ� ���� �� ������ �����
	// ��, ������ �̸��� �̸����� �Ѵ�.
	// �����̸�: �Ͽ���.txt -> �Ͽ���/33/����� ���α�
	// �����̸�: �̿���.txt -> �̿���/23/����� �߱�
	// �����̸�: �����.txt -> �����/25/����� ���빮��

	// 4 ���� �� ������ ������ �Է��Ͽ� �ε��� �Ŀ�
	// 2 �����ϸ� ������ ��µ�

	// �̸� : �̿���
	// ���� : 23
	// �ּ� : ����� �߱�
	private static String name;
	private static int age;
	private static String address;
	
	public static void main(String[] args) {
		end:
		while (true) {
			int choice = printMenu();
			switch (choice) {
			case 1:
				insert();
				break;
			case 2:
				print();
				break;
			case 3:
				save();
				break;
			case 4:
				load();
				break;
			case 0:
				break end;
			default:
				System.out.print("1 ~ 4 ������ ���ڸ� �Է����ּ���.");
			}
		}
	}

	static int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.�����Է�");
		System.out.println("2.�������");
		System.out.println("3.��������(save �� �Է¹��� �̸��� ���ϸ�)");
		System.out.println("4.�����ҷ�����(load �� 2������ ���)");
		System.out.println("0.����");
		System.out.print("�޴� �Է� : ");
		int select = sc.nextInt();
		return select;
		
	}

	static void insert() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� �Է� : ");
		name = sc.next();
		System.out.print("���� �Է� : ");
		age = sc.nextInt();
		System.out.print("�ּ� �Է� : ");
		//sc.nextLine()�� �� �����ؾ��� ����?
		//����
		sc.nextLine();
		address = sc.nextLine();
		System.out.println("====== ====== ======");
	}

	static void print() {
		System.out.println("====== ���� ��� ======");
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("�ּ� : " + address);
		System.out.println("====== ====== ======");
	}

	static void save() {
		Writer os = null;
		
		try {
			String result = name + "/" + age + "/" + address;
			os = new FileWriter("src/iostream/" + name + ".txt");
			os.write(result);
			os.flush();
			System.out.println("����Ϸ�Ǿ����ϴ�.");
			System.out.println("=== === === === === ===");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	static void load() {
		Reader reader = null;  //���ڱ�� �Է½�Ʈ��
		BufferedReader bfReader = null;  //������Ʈ��
		Scanner sc = new Scanner(System.in);
		System.out.print("���ϸ� �Է� : ");
		String fileName = sc.next();
		String result = "";
		try {
			reader = new FileReader("src/iostream/" + fileName + ".txt");
			bfReader = new BufferedReader(reader);
			//reader.read();
			result = bfReader.readLine();  //������ ���پ� �о��
			//result -> �Ͽ��� / 25 / ����� ���빮��
			// '/'�� �������� �ڸ��� ��� 2����
			//1.split(), 2.StringTokenizer
			StringTokenizer st = new StringTokenizer(result, "/");
			name = st.nextToken();
			age = Integer.parseInt(st.nextToken());  //String -> int ����!! wrapperŬ����
			address = st.nextToken();
			System.out.println("�ε尡 �Ϸ�Ǿ����ϴ�!!");
			System.out.println("���� ��� �����մϴ�. 2���� �����ּ���");
			System.out.println("=== === === === === ===");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
