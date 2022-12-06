package com.kh.day04.exercise;

public class Exercise_ForDouble3 {

	public static void main(String[] args) {
		// *
		// **
		// ***
		// ****
		// *****
		// ******
		// *******
		// ********
		// *********
		// **********
		
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < i + 1; j++) {  //』』j < i + 1;』』
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		for (int i = 1; i < 11; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
	}
}
