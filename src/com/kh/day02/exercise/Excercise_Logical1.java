package com.kh.day02.exercise;

import java.util.Scanner;

public class Excercise_Logical1 {
	public static void main(String [] args) {
		//�Է��� ������ 1 ~ 100 ������ �������� Ȯ���ϼ���!
		//��, 50�̶�� ���ڴ� ���� num�� �ʱ�ȭ���ּ���
		//1���� 100������ �����ΰ�? : true

		Scanner sc = new Scanner(System.in);
		System.out.print("1~100���� ���� �Է��ϼ��� : ");
		int num = sc.nextInt();
		//1 < num < 100
		//1���� 100 �������� �Ǻ�
		boolean result = (1 < num) && (num < 100);
		System.out.println("1���� 100 ������ �����ΰ�? " + result);
	}
}
