package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_While2 {
	public static void main(String[] args) {
		// ������ �ϳ� �Է¹޾Ƽ� �� ���� 1 ~ 9 ������ ���� ����
		// �� ���� �������� ����ϼ���
		// ��, ������ ���� ������ "1 ~ 9 ������ ����� �Է��Ͽ��� �մϴ�"�� ����ϼ���

		Scanner sc = new Scanner(System.in);
		System.out.print("1 ~ 9������ ���� �ϳ� �Է�: ");
		int dan = sc.nextInt();

		if ((dan >= 1) && (dan <= 9)) {
			int i = 1;
			while (i < 10) {
				System.out.println(dan + " * " + i + " = " + dan * i);
				i++; // �١١��߿�١١�
			}
		} else
			System.out.println("1 ~ 9 ������ ����� �Է��Ͽ��� �մϴ�.");

//		if((dan >=1) && (dan <= 9)) {
//			for(int i = 1; i < 10; i++) {
//				System.out.println(dan + " * " + i + " = " + dan * i);
//			}
//		} else
//			System.out.println("1~9������ ����� �Է��Ͽ��� �մϴ�.");
	}

}
