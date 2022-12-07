package com.kh.day11.exercise;

public class Exercise_Wrapper {
	public void paserExample() {
		String strNum = "221123";
		String strNum2 = "230502";
		//두 값을 계산해서 출력하시오(Num2 - Num)
		//결과: 1819
		
		int result = Integer.parseInt(strNum2) - Integer.parseInt(strNum);
		
		/*int num1 = Integer.parseInt(strNum);
		int num2 = Integer.parseInt(strNum2);
		int result = num2 - num1;*/
		System.out.println("결과: " + result);
		
	}
	
	public void dataParsingExample() {
		String strData = "13";
		String strData2 = "23.502";
		String strData3 ="SPRING";
		
		//1. strData를 byte, short, int, long로 변환하시오.
		byte bNum = Byte.parseByte(strData);
		short sNum = Short.parseShort(strData);
		int iNum = Integer.parseInt(strData);
		long lNum = Long.parseLong(strData);
		
		//2. strData2를 flaot, double로 변환하시오.
		float fNum = Float.parseFloat(strData2);
		double dNum = Double.parseDouble(strData2);
		
		//3. strData3를 char로 변환하시오.
		char c = strData3.charAt(0);  //숫자는 범위내에서 아무거나 넣기(0, 1, 2, 3, 4, 5)
	}
}
