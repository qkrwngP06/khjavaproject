package com.kh.day03.exscanner;

import java.util.Scanner;

public class TestScanner {
	public static void main(String [] args) {
		//�̸��� �Է����ּ���. //next() 
		//������
		//�¾ ���� �Է����ּ���.
		//6
		//Ű�� �Է����ּ���.
		//165
		//������ �Է����ּ���.
		//��
		//�ּҸ� �Է����ּ���. //nextLine()
		//����� ���빮��
		
		//�̸��� �������Դϴ�.
		//�¾ ���� 6�Դϴ�.
		//Ű�� 165.0�Դϴ�.
		//������ ���Դϴ�.
		//�ּҴ� ����� ���빮���Դϴ�. 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է����ּ���:");
		String name = sc.next(); //�����ִ°� �Է��� �ȹ���
		
		System.out.print("�¾ ���� �Է����ּ���:");
		int month = sc.nextInt();
		
		System.out.print("Ű�� �Է����ּ���:");
		double height = sc.nextDouble();
		
		System.out.print("������ �Է����ּ���:");
		char gender = sc.next().charAt(0);
		
		System.out.print("�ּҸ� �Է����ּ���:");
		sc.nextLine();//��������
		String address = sc.nextLine(); //���� �Է¹���,�� �� ������
		
		System.out.println();
		System.out.println("�̸��� " + name + " �Դϴ�.");
		System.out.println("�¾ ���� " + month + "�� �Դϴ�.");
		System.out.println("Ű�� " + height + " �Դϴ�.");
		System.out.println("������ " + gender + " �Դϴ�.");
		System.out.println("�ּҴ� " + address + " �Դϴ�.");
	}
}
