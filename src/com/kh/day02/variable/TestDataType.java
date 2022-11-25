package com.kh.day02.variable;

public class TestDataType {
	public static void main(String [] args) {
		/*시험에 나올 수 있음*/
		
		//자료형 변수명 대입연산자 데이터;
		//1.자료형의 종류
		//정수,문자열
		//int, String
		
		//정수 part
		byte bNum = 127; //byte범위: -128 ~ +127
		short sNum = 32767; //short 범위: -32768 ~ +32767
		int iNum = 2147483647; //int 범위:-2147483648 ~ +2147483647
		long lNum = 2147483648l; //접미사 l을 붙여야함
		short num = 128;
		
		//실수 part
		//평균 구할 때 사용
		float fNum = 22.1123f; //접미사 f를 붙여야함
		double dNum = 23.502; 
		
		//문자 part
		char fChar = 'A'; //홑따옴표 안에는 1개의 문자
		String sChar = "Hello Java"; //쌍따옴표 안에는 여러개 문자
		
		//Boolean형
		boolean result = false; //true,false
		// 1>0(true) , 2<1(false)
		
		
		System.out.println("정수의 값: " + iNum);
		System.out.println("정수의 값(9999억): " + lNum);
		System.out.println("실수의 값: " + fNum);
		System.out.println("실수의 값: " + dNum);
		System.out.println("문자의 값: " + fChar);
		System.out.println("문자열의 값: " + sChar);
		System.out.println("논리의 값: " + result);
		
		
		//ASCII(아스키)코드
		//문자(Char)는 숫자를 저장할 수 있고 ASCII코드에
		//매핑되어 있는 문자로 출력이 가능함
		fChar = 66; 
		System.out.println("문자에 숫자1: "+fChar);
		fChar = 75;
		System.out.println("문자에 숫자2: "+fChar);
	}
}
