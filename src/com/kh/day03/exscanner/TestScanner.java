package com.kh.day03.exscanner;

import java.util.Scanner;

public class TestScanner {
	public static void main(String [] args) {
		//이름을 입력해주세요. //next() 
		//박주혜
		//태어난 월을 입력해주세요.
		//6
		//키를 입력해주세요.
		//165
		//성별을 입력해주세요.
		//여
		//주소를 입력해주세요. //nextLine()
		//서울시 서대문구
		
		//이름은 박주혜입니다.
		//태어난 월은 6입니다.
		//키는 165.0입니다.
		//성별은 여입니다.
		//주소는 서울시 서대문구입니다. 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력해주세요:");
		String name = sc.next(); //공백있는거 입력을 안받음
		
		System.out.print("태어난 월을 입력해주세요:");
		int month = sc.nextInt();
		
		System.out.print("키를 입력해주세요:");
		double height = sc.nextDouble();
		
		System.out.print("성별을 입력해주세요:");
		char gender = sc.next().charAt(0);
		
		System.out.print("주소를 입력해주세요:");
		sc.nextLine();//엔터제거
		String address = sc.nextLine(); //띄어쓰기 입력받음,긴 거 적을때
		
		System.out.println();
		System.out.println("이름은 " + name + " 입니다.");
		System.out.println("태어난 월은 " + month + "월 입니다.");
		System.out.println("키는 " + height + " 입니다.");
		System.out.println("성별은 " + gender + " 입니다.");
		System.out.println("주소는 " + address + " 입니다.");
	}
}
