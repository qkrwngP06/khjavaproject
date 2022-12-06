package com.kh.day04.exercise;

public class Exercise_While1 {
	public static void main(String[] args) {
		// while문을 이용하여 1 ~ 100 사이의 홀수의 합을 출력하시오
		int i = 1;
		int sum = 0;
		while (i < 100) {
			sum = sum + i;
			// i++; for(int i = 1; i <= 100; i++) 1부터 100까지의 합
			// i = i + 2;
			i += 2; // 복합대입연산자로 표현
			// i = i + 4; -> i += 4;
			// i = i * 2; -> i *= 2;
		}
		System.out.println("합계: " + sum);
	}
}
