package com.kh.day02.exscanner;

import java.util.Scanner;

public class TestScanner2 {
	public static void main(String [] args) {
		//�Է¹��� �� �ִ� �����ʹ� 
		//����, �Ǽ�, ���ڿ�, (��)����(��)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է����ּ��� : ");
		int iNum = sc.nextInt();
		System.out.println("�Է��� ������ : " + iNum);
		
		System.out.print("�Ǽ��� �Է����ּ��� : ");
		double dNum = sc.nextDouble();
		System.out.println("�Է��� �Ǽ��� : " + dNum);
		
		System.out.print("���ڿ��� �Է����ּ��� : ");
		String words = sc.next(); //nextString()�� ����
		System.out.println("�Է��� ���ڿ��� : " + words);
		
		System.out.print("���ڸ� �Է����ּ��� : ");
		char word = sc.next().charAt(0); //ABC (0,1,2), nextChar()����
		System.out.println("�Է��� ���ڴ� : " + word);
	}
}
