package com.kh.day04.exercise;

public class Exercise_ForDouble1 {
	public static void main(String[] args) {
		// 2�� ���� 3��, 3�� ���� 4��, 4�� ���� 5���� �ǵ��� �ۼ��ϱ�

		// <������� �����ϱ�(������)>
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
			<����Ǯ�� �ؿ�ó�� ������� �����ϱ�>
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
