package com.kh.day11.exercise;

public class Exercise_Wrapper {
	public void paserExample() {
		String strNum = "221123";
		String strNum2 = "230502";
		//�� ���� ����ؼ� ����Ͻÿ�(Num2 - Num)
		//���: 1819
		
		int result = Integer.parseInt(strNum2) - Integer.parseInt(strNum);
		
		/*int num1 = Integer.parseInt(strNum);
		int num2 = Integer.parseInt(strNum2);
		int result = num2 - num1;*/
		System.out.println("���: " + result);
		
	}
	
	public void dataParsingExample() {
		String strData = "13";
		String strData2 = "23.502";
		String strData3 ="SPRING";
		
		//1. strData�� byte, short, int, long�� ��ȯ�Ͻÿ�.
		byte bNum = Byte.parseByte(strData);
		short sNum = Short.parseShort(strData);
		int iNum = Integer.parseInt(strData);
		long lNum = Long.parseLong(strData);
		
		//2. strData2�� flaot, double�� ��ȯ�Ͻÿ�.
		float fNum = Float.parseFloat(strData2);
		double dNum = Double.parseDouble(strData2);
		
		//3. strData3�� char�� ��ȯ�Ͻÿ�.
		char c = strData3.charAt(0);  //���ڴ� ���������� �ƹ��ų� �ֱ�(0, 1, 2, 3, 4, 5)
	}
}
