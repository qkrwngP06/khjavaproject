package com.kh.day02.variable;

public class TestVariable {
	public static void main(String [] args) {
		//자료형 변수명 대입연산자 데이터;
		int kh = 34; //변수 사용이유: 재사용하기 위해
		String msg = "Hello World";
		int num; //변수의 선언
		num = 100; //변수의 초기화
		//int num = 100;
		System.out.println("kh"); //문자열
		System.out.println(kh); 
		System.out.println(msg);
		System.out.println(num);
		num = 101;  //num이 100이였다가 초기화를 다시 해서
		System.out.println(num); //101이라는 값이 나옴
		num = num +1;
		System.out.println(num);
	}
}
