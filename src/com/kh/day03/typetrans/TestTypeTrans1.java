package com.kh.day03.typetrans;

public class TestTypeTrans1 {
	public static void main(String [] args) {
		//����Ÿ���� ū Ÿ���� ������ ū Ÿ������ ����(int -> double)
		int iNum = 10; //�Ǽ��� ������ �ڵ� ����ȯ�� �Ǿ 10.0
		double dNum = 13.2;
		double result = iNum + dNum;
		System.out.println("result: "+result);
		
		//ū Ÿ���� ���� Ÿ������ ��ȯ
		System.out.println("���� �� ��ȯ: " + (int)result); //4byte
		System.out.println("���� �� ��ȯ2: " +(char)65); //2byte
	}
}
