package com.kh.day06.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_Exception {
	public void practice1() {
		// for(;;){}
		// while(true){}
		while (true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print("정수 하나 입력해주세요: ");
				int num1 = sc.nextInt();
				System.out.print("정수 하나 더 입력해주세요: ");
				int num2 = sc.nextInt();
				System.out.println("나눠드릴게요 ^^");
				int result = num1 / num2;
				System.out.println("몫은 " + result + "입니다~");
				break;
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
			}
		}
	}

	public void practice2() {
		// 정수 3개를 입력하세요
		// 0 >> 5
		// 1 >> R
		// 정수가 아닙니다. 다시 입력하세요.
		// 1 >> 4
		// 2 >> 6
		// 합은 15

		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int input = 0;  //전역변수(여기다 선언해주면 try문 안에 for문 안에 다 사용가능)
		for (int i = 0; i < 3; i++) {
			System.out.print(i + ">>");
			try {
				input = sc.nextInt(); // 오류 발생   지역변수 int input이 되면은 try안에서만 가능
			} catch (InputMismatchException e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요!");
				//순차적으로 생각해보기!
				sc.next();  //입력된 R값 제거
				i--;  //1>>로 다시 가도록 -1해줌, i++를 만나서 1이 되기 위해서 
				continue; //sum += input;을 스킵하도록 함.
			}
			sum += input;
		}
		System.out.println("합은: " + sum);
	}

}
