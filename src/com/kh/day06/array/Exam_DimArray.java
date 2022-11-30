package com.kh.day06.array;

public class Exam_DimArray {
	public static void main(String [] args){ 
		//영화 좌석표 예매같은 거 할때 2차원 배열 이용함
		
		int [][] arrs = new int[4][4];  //[행][열]
		int k = 1;
		System.out.println("세로의 크기(앞의 크기): " + arrs.length);
		System.out.println("가로의 크기(뒤의 크기): " + arrs[0].length);
//		arrs[0][0] = 1;
//		arrs[0][1] = 2;
//		arrs[0][2] = 3;
//		arrs[1][0] = 4;
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				arrs[i][j] = k;
				k++;
			}
		}
		//출력
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%2d ",arrs[i][j]);  //자릿수 맞춰주기
			}
			System.out.println(); //개행해주기
		}
	}
}
