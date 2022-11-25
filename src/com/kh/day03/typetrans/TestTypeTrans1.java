package com.kh.day03.typetrans;

public class TestTypeTrans1 {
	public static void main(String [] args) {
		//작은타입이 큰 타입을 만나면 큰 타입으로 변함(int -> double)
		int iNum = 10; //실수를 만나서 자동 형변환이 되어서 10.0
		double dNum = 13.2;
		double result = iNum + dNum;
		System.out.println("result: "+result);
		
		//큰 타입이 작은 타입으로 변환
		System.out.println("강제 형 변환: " + (int)result); //4byte
		System.out.println("강제 형 변환2: " +(char)65); //2byte
	}
}
