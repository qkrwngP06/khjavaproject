package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_CalculatorFor {
	public static void main(String[] args) {
		// Alt + 방향키
		int count = 0;
		Scanner sc = new Scanner(System.in);
		for (;;) {
			//무한반복
			System.out.print("정수를 입력해주세요: ");
			int num1 = sc.nextInt();

			System.out.print("정수를 한번 더 입력해주세요: ");
			int num2 = sc.nextInt();

			System.out.print("연산자를 입력해주세요(+, -, *, / , %) : ");
			char operator = sc.next().charAt(0); // sc.next() ->문자열 .charAt(0) -> 첫번째 값을 자름

			int result = 0;

			// 연산자 판별 후 연산 수행 그리고 결과 저장
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
			count++; //출력에 성공했을 때 카운트 업!
			if (count == 3) {
				break;  //무한반복 멈추게함
			}
		}
	}
}
