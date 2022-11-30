package com.kh.day05.exercise;

import java.util.Scanner;

public class Exercise_Array {
	public void exercise1() {
		// 길이가 100인 배열을 선언하고 1부터 100까지의 값을
		// 순서대로 넣어 그 값을 출력하는 코드를 작성하시오
		int[] nums = new int[100];  //길이가 100인 배열 선언
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i;
			System.out.print(nums[i]);
		}
	}

	public void exercise2() {
		// 길이가 5인 String 배열을 선언하고
		// "딸기", "복숭아", "키위", "사과","바나나"로 초기화 한 후,
		// for문을 활용해서 바나나가 있으면 바나나를 출력
		String[] fruits = new String[5];
		fruits[0] = "딸기";
		fruits[1] = "복숭아";
		fruits[2] = "키위";
		fruits[3] = "사과";
		fruits[4] = "바나나";
		/*
		for (int i = 0; i < fruits.length; i++) {
			if (fruits[i] == "바나나") {
				System.out.print(fruits[i] + " ");
			}
		}*/
		//조금 더 편하게! -> 할당과 초기화 동시에!!
		String [] fruitGoods = {"딸기", "복숭아", "키위", "사과", "바나나"};
		for (int i = 0; i < fruitGoods.length; i++) {
			if (fruitGoods[i] == "바나나") {
				System.out.print(fruitGoods[i] + " ");
			}
		}
	}
	
	public void exercise3() {
		//양의 정수 5개를 입력받아 배열에 저장하고
		//입력받은 값들의 평균을 구하는 프로그램 작성
		
		int [] arrs = new int[5];
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수 5개 입력:");
		for(int i = 0; i < arrs.length; i++) {
			arrs[i] = sc.nextInt();
			sum = sum + arrs[i]; //sum += arrs[i];
		}
		//평균은 총합/데이터의 갯수, 1,2 ->  1 + 2 / 2 = 1.5
		System.out.println("평균은 " + (double)sum / arrs.length + "입니다.");
	}
	
	public void exercise4() {
		//양의 정수 5개를 입력받아 배열에 저장하고
		//제일 큰 수를 출력하는 프로그램을 작성
		
		int [] arrs = new int[5];
		int max = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수 5개 입력:");
		for(int i = 0; i < arrs.length; i++) {
			arrs[i] = sc.nextInt();
			if(arrs[i] > max ) {
				max = arrs[i];
			}
		} 
		System.out.println("가장 큰 수는 " + max + "입니다.");
	}
	
	public void exercise5() {
		//사용자에게 주민번호를 입력 받은 후
		//성별 자리 이후부터 *로 저장되어 출력되도록 프로그램 작성
		//210618-1124600 -> 210618-1******
		//200518-3233920 -> 20518-3******
		
		Scanner sc = new Scanner(System.in);
		char [] origin = new char[14];
		System.out.print("주민등록번호 입력(-포함): ");
		String memberNum = sc.next();
		
		//String으로 입력받은 값을 하나씩 잘라서 origin 문자배열에 넣기!
		for(int i = 0; i < origin.length; i++) {
			origin[i] = memberNum.charAt(i);
			//System.out.print(origin[i]);
		}
		/*
		char [] copy = origin; //얕은 복사, 이러면 의도한 것이 아니다!
		for(int i = 0; i < origin.length; i++) {  //복사한 것 수정
			if(i > 7) {
				copy[i] = '*';
			}
			//System.out.print(origin[i]);
			System.out.print(copy[i]);
		}
		System.out.println();
		for(int i = 0; i < origin.length; i++) {   //원본 출력
			System.out.print(origin[i]);
		}*/
		
		char [] copy = new char[14]; //깊은 복사의 시작!
		for(int i = 0; i < origin.length; i++) {  //복사한 것 수정
			if(i < 8) {
				copy[i] = origin[i];  //값을 복사
			} else
				copy[i] = '*';
				
			//System.out.print(origin[i]);
			System.out.print(copy[i]);
		}
		System.out.println();
		for(int i = 0; i < origin.length; i++) {   //원본 출력
			System.out.print(origin[i]);
		}
	}
	//forEach문1
	public void exercise6() {
		int [] nums = {1, 2, 3, 4, 5};   //할당과 초기화 동시에
		for(int num : nums) {
			System.out.print(num + " ");
		}
	}
	//forEach문2
	public void exercise7() {
		String [] fruits = {"딸기", "복숭아", "포도", "체리", "망고"};
		for(String fruit : fruits) {
			System.out.print(fruit + " ");
		}
	}
}
