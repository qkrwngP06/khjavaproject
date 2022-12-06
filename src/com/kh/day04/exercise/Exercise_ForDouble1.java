package com.kh.day04.exercise;

public class Exercise_ForDouble1 {
	public static void main(String[] args) {
		// 2단 옆에 3단, 3단 옆에 4단, 4단 옆에 5단이 되도록 작성하기

		// <순서대로 이해하기(설명가능)>
		// 1. 2 * 1 = 2, 2 * 2 = 4, 2 * 3 = 6.....
		// 2. 2 * 1 = 2, 3 * 1 = 3, 4 * 1 = 4......
		// 3. 2 * 1 = 2, 3 * 1 = 3, 4 * 1 = 4......
		// 	  2 * 2 = 4, 3 * 2 = 6, 4 * 2 = 8......

		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				// System.out.print("2 * i" + " = " + 2 * i + "\t");
				// System.out.print(i + " * 1" + " = " + i * i + "\t");
				System.out.print(i + " * " + j + " = " + j * i + "\t");
			}
			System.out.println();
		}

		/*
		for(int j = 1; j < 10; j++) {
			for(int i = 2; i < 10; i++) {
				System.out.print(i + " * " + j + " = " + i * j + "\t");
			}
			System.out.println();
		}*/
		
		/*
			<문제풀때 밑에처럼 순서대로 생각하기>
			1.for(int j = 1; j < 10; j++) {
				System.out.println("2 * " + j + " = " + 2 * j);
			}
			 2.for(int j = 1; j < 10; j++) {
				System.out.print("2 * " + j + " = " + 2 * j + "\t");
			}
			 3.for(int j = 1; j < 10; j++) {
				System.out.print(j + " * 1" +  " = " + j * 1 + '\t');
			}
			 3.for(int j = 2; j < 10; j++) {
			System.out.print(j + " * i" + i +" = " + j * i + '\t');
		}
			4.for(int i = 1; i < 10; i++) {
				for(int j = 2; j < 10; j++) {
					System.out.print(j + " * i" + i +" = " + j * i + "\t");
				}
			}*/
	}
}
