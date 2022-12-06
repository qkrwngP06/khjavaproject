package com.kh.day04.loop;

public class Exam_ForDouble2 {

	public static void main(String[] args) {
		/* 별찍기
		 * *****
		 * *****
		 * *****
		 * *****
		 * *****
		 */
		
		/*
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		*/
		
		/*
		for(int i = 0; i < 5; i++) {
			System.out.print("*");
			System.out.print("*");
			System.out.print("*");
			System.out.print("*");
			System.out.print("*");
			System.out.println();
		}*/
		
		
		for(int i = 0; i < 5; i++) {  //5번 반복
			for(int j = 0; j < 5; j++) {  //5번출력
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
