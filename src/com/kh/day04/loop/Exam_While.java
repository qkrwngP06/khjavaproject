package com.kh.day04.loop;

public class Exam_While {
	public static void main(String[] args) {
		/*
		 * for (int i = 0; i < 10; i++) { System.out.print(i); }
		 */

		/*
		 * int i; for (i = 0; i < 10; i++) { System.out.print(i); }
		 */

		// 0123456789
		int i = 0;
		while (i < 10) {
			System.out.print(i);
			if (i <= 8) {
				System.out.print(" , ");
			}
			i++;
		}

		/*
		 * for (int j = 9; j >= 0; j--) { System.out.pirnt(j); }
		 */

		System.out.println(); // 줄바꾸기
		// 9876543210
		int j = 9;
		while (j >= 0) {
			System.out.print(j);
			if (j >= 1) {
				System.out.print(" , ");
			}
			j--;
		}
	}
}
