package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է����ּ���: ");
		int num1 = sc.nextInt();
		

		System.out.print("������ �ѹ� �� �Է����ּ���: ");
		int num2 = sc.nextInt();

		System.out.print("�����ڸ� �Է����ּ���(+, -, *, / , %) : ");
		char operator = sc.next().charAt(0); //sc.next() ->���ڿ�  .charAt(0) -> ù��° ���� �ڸ�
		
		int result = 0;
		
		//������ �Ǻ� �� ���� ���� �׸��� ��� ����
		switch (operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		case '%':
			result = num1 % num2;
			break;
		}
		System.out.println("���: " + num1 + " " + operator + " " + num2 + " " + " = " + result);
	}
}
