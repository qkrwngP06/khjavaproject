package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_For4 {
	public static void main(String[] args) {
		// ������ �ϳ� �Է¹޾Ƽ� �� ���� 1 ~ 9 ������ ���� ����
		// �� ���� �������� ����ϼ���
		// ��, ������ ���� ������ "1 ~ 9 ������ ����� �Է��Ͽ��� �մϴ�"�� ����ϼ���

		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է�:");
		int dan = sc.nextInt();
		
		if((dan >= 1) && (dan <= 9)) {
			for(int i = 1; i < 10; i++) {
				System.out.println(dan + " * " + i + " = " +  dan * i);
			}
		} else
			System.out.println("1 ~ 9������ ����� �Է��Ͽ��� �մϴ�.");
	}
}
