package com.kh.day11.wrapperex;

public class Exam_BoxingUnBoxing {
	public static void main(String [] arggs) {
		Integer num = Integer.valueOf(0);
		//Boxing(°¨½Ñ´Ù) -> ÀÚµ¿ ¹Ú½Ì
		Integer su = 0;
		
		int soo = num.intValue();
		//UnBoxing -> ÀÚµ¿ ¾ð¹Ú½Ì
		soo = num;
		
		int n = 10;
		Integer intObject = n;  //Boxing
		System.out.println("intObject: " + intObject);
		
		int m = intObject + 10; //Integer(->int) + int => UnBoxing
		System.out.println("m = " + m);
	}
}
