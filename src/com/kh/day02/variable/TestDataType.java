package com.kh.day02.variable;

public class TestDataType {
	public static void main(String [] args) {
		/*���迡 ���� �� ����*/
		
		//�ڷ��� ������ ���Կ����� ������;
		//1.�ڷ����� ����
		//����,���ڿ�
		//int, String
		
		//���� part
		byte bNum = 127; //byte����: -128 ~ +127
		short sNum = 32767; //short ����: -32768 ~ +32767
		int iNum = 2147483647; //int ����:-2147483648 ~ +2147483647
		long lNum = 2147483648l; //���̻� l�� �ٿ�����
		short num = 128;
		
		//�Ǽ� part
		//��� ���� �� ���
		float fNum = 22.1123f; //���̻� f�� �ٿ�����
		double dNum = 23.502; 
		
		//���� part
		char fChar = 'A'; //Ȭ����ǥ �ȿ��� 1���� ����
		String sChar = "Hello Java"; //�ֵ���ǥ �ȿ��� ������ ����
		
		//Boolean��
		boolean result = false; //true,false
		// 1>0(true) , 2<1(false)
		
		
		System.out.println("������ ��: " + iNum);
		System.out.println("������ ��(9999��): " + lNum);
		System.out.println("�Ǽ��� ��: " + fNum);
		System.out.println("�Ǽ��� ��: " + dNum);
		System.out.println("������ ��: " + fChar);
		System.out.println("���ڿ��� ��: " + sChar);
		System.out.println("���� ��: " + result);
		
		
		//ASCII(�ƽ�Ű)�ڵ�
		//����(Char)�� ���ڸ� ������ �� �ְ� ASCII�ڵ忡
		//���εǾ� �ִ� ���ڷ� ����� ������
		fChar = 66; 
		System.out.println("���ڿ� ����1: "+fChar);
		fChar = 75;
		System.out.println("���ڿ� ����2: "+fChar);
	}
}
