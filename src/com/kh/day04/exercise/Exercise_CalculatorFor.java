package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_CalculatorFor {
	public static void main(String[] args) {
		// Alt + ����Ű
		int count = 0;
		Scanner sc = new Scanner(System.in);
		for (;;) {
			//���ѹݺ�
			System.out.print("������ �Է����ּ���: ");
			int num1 = sc.nextInt();

			System.out.print("������ �ѹ� �� �Է����ּ���: ");
			int num2 = sc.nextInt();

			System.out.print("�����ڸ� �Է����ּ���(+, -, *, / , %) : ");
			char operator = sc.next().charAt(0); // sc.next() ->���ڿ� .charAt(0) -> ù��° ���� �ڸ�

			int result = 0;

			// ������ �Ǻ� �� ���� ���� �׸��� ��� ����
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
			count++; //��¿� �������� �� ī��Ʈ ��!
			if (count == 3) {
				break;  //���ѹݺ� ���߰���
			}
		}
	}
}
