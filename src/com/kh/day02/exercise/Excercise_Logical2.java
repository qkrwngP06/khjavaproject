package com.kh.day02.exercise;

import java.util.Scanner;

public class Excercise_Logical2 {
	public static void main(String [] args) {
		//�Է¹��� ���ڰ� �빮������ �ҹ������� Ȯ���ϼ���!
		//��, A��� ���ڴ� ���� word�� �ʱ�ȭ���ּ���.
		//���� �빮�� Ȯ��: true
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է����ּ��� : ");
		char word = sc.next().charAt(0);
		//�빮������ �Ǻ�
		//65 < word < 90:�빮��
		 boolean result = ('A' <= word) && (word <='Z');
		System.out.println("���� �빮�� Ȯ��: " + result);
	}
}
