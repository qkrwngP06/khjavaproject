package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요: ");
		int num1 = sc.nextInt();
		

		System.out.print("정수를 한번 더 입력해주세요: ");
		int num2 = sc.nextInt();

		System.out.print("연산자를 입력해주세요(+, -, *, / , %) : ");
		char operator = sc.next().charAt(0); //sc.next() ->문자열  .charAt(0) -> 첫번째 값을 자름
		
		int result = 0;
		
		//연산자 판별 후 연산 수행 그리고 결과 저장
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
		System.out.println("결과: " + num1 + " " + operator + " " + num2 + " " + " = " + result);
	}
}
