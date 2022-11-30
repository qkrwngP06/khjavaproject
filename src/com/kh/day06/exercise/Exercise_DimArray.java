package com.kh.day06.exercise;

public class Exercise_DimArray {
	public void exercise1() {
		//5 4 3 2 1
		//10 9 8 7 6
		//15 14 13 12 11 
		//20 19 18 17 16
		//25 24 23 22 21
		
		// arrs[0][0] arrs[0][1] arrs[0][2] arrs[0][3] arrs[0][4]
		// arrs[1][0] arrs[1][1] arrs[1][2] arrs[1][3] arrs[1][4]
		// arrs[2][0] arrs[2][1] arrs[2][2] arrs[2][3] arrs[2][4]
		// arrs[3][0] arrs[3][1] arrs[3][2] arrs[3][3] arrs[3][4]
		// arrs[4][0] arrs[4][1] arrs[4][2] arrs[4][3] arrs[4][4]
		int [][] arrs = new int[5][5];
		int k = 1;
		for(int i = 0; i < arrs.length; i++) {
			for(int j = arrs.length-1; j >= 0; j--) {
				arrs[i][j] = k;
				k++;
			}
		}
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%2d ",arrs[i][j]);
			}
			System.out.println(); //개행해주기
		}
	}
	public void exercise2() {
		//5 10 15 20 25
		//4 9 14 19 24
		//3 8 13 18 23
		//2 7 12 17 22
		//1 6 11 16 21
		
		// arrs[0][0] arrs[0][1] arrs[0][2] arrs[0][3] arrs[0][4]
		// arrs[1][0] arrs[1][1] arrs[1][2] arrs[1][3] arrs[1][4]
		// arrs[2][0] arrs[2][1] arrs[2][2] arrs[2][3] arrs[2][4]
		// arrs[3][0] arrs[3][1] arrs[3][2] arrs[3][3] arrs[3][4]
		// arrs[4][0] arrs[4][1] arrs[4][2] arrs[4][3] arrs[4][4]
		int [][] arrs = new int[5][5];
		int k = 1;
		for(int i = 0; i < arrs.length; i++) {
			for(int j = arrs.length-1; j >= 0; j--) {
				arrs[j][i] = k;
				k++;
			}
		}
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%2d ",arrs[i][j]);
			}
			System.out.println(); //개행해주기
		}
	}
	
	public void exercise3() {
		//1 6 11 16 21
		//2 7 12 17 22
		//3 8 13 18 23
		//4 9 14 19 24
		//5 10 15 20 25
		
		//arrs[0][0] arrs[0][1] arrs[0][2] arrs[0][3] arrs[0][4]
		//arrs[1][0] arrs[1][1] arrs[1][2] arrs[1][3] arrs[1][4]
		//arrs[2][0] arrs[2][1] arrs[2][2] arrs[2][3] arrs[2][4]
		//arrs[3][0] arrs[3][1] arrs[3][2] arrs[3][3] arrs[3][4]
		//arrs[4][0] arrs[4][1] arrs[4][2] arrs[4][3] arrs[4][4]
		int [][] arrs = new int[5][5];
		int k = 1;
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				arrs[j][i] = k;
				k++;
			}
		}
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%2d ",arrs[i][j]);
			}
			System.out.println(); //개행해주기
		}
	}
	public void exercise4() {
		//1 2 3 4 5
		//10 9 8 7 6
		//11 12 13 14 15
		//20 19 18 17 16
		//21 22 23 24 25
		//짝수면 증가, 홀수면 감소
		//arrs[0][0] arrs[0][1] arrs[0][2] arrs[0][3] arrs[0][4]
		//arrs[1][4] arrs[1][3] arrs[1][2] arrs[1][1] arrs[1][0]
		//arrs[2][0] arrs[2][1] arrs[2][2] arrs[2][3] arrs[2][4]
		//arrs[3][4] arrs[3][3] arrs[3][2] arrs[3][1] arrs[3][0]
		//arrs[4][0] arrs[4][1] arrs[4][2] arrs[4][3] arrs[4][4]
		int [][] arrs = new int[5][5];
		int k = 1;
		for(int i = 0; i < arrs.length; i++) {
			if(i % 2 == 0) {  //짝수일 때 증가
				for(int j = 0; j < arrs[i].length; j++) {
					arrs[i][j] = k++;
				}
			} else { //홀수일 때 감소
				for(int j = arrs.length - 1; j >= 0; j--) {
					arrs[i][j] = k++;
				}
			}
		}
		//출력
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%2d ",arrs[i][j]);
			}
			System.out.println(); //개행해주기
		}
	}
	public void exercise5() {
		//2차원 배열에 학년별로 1,2학기 성적으로 저장하고
		//4년간 전체 평점 평균을 출력하라.
		double [][] score = {{3.3, 3.4}, {3.5, 3.6}, {3.7, 4.0}, {4.1, 4.2}};
		double sum = 0;
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
			}
		}
		int sero = score.length; //4
		int garo = score[0].length; //2
		System.out.println("4년 전체 평점 평균: " + sum / (sero*garo));
	}
}
