package com.kh.day10.wrapperex;

public class Exam_Wrapper {
	public static void main(String [] args) {
		//Wrapper ��ü�κ��� �⺻ Ÿ�� �� �˾Ƴ���
		//The constructor Integer(int) is deprecated since version 9
		//Integer i = new Integer(1123);  //Ŭ����(Integer)
		Integer i = Integer.valueOf(1123);
		//��ü�� ���� ����ϴٰ�
		int e = i.intValue();  //�⺻��
		//�⺻������ ��ȯ����
		Integer f = null;
		//Type mismatch: cannot convert from null to int
		//int m = null;
		
		Character c = Character.valueOf('c');
		char che = c.charValue();
		
		Double d = Double.valueOf(3.14);
		double dd = d.doubleValue();
		
		//���ڿ��� �⺻ ������ Ÿ��(int, boolean, double)���� ��ȯ
		//Type mismatch: cannot convert from String to int
		//int num = "123";
		int num = Integer.parseInt("123");  //����� �ϱ� ���� �ٲ�
		System.out.println("��ȯ�� ��: " + num);
		//Type mismatch: cannot convert from String to boolean
		//boolean isYn = "true";
		boolean isYn = Boolean.parseBoolean("true");
		//Type mismatch: cannot convert from String to double
		//double fNum = "3.14";
		double fNum = Double.parseDouble("3.14");
		
		//�⺻ ������ Ÿ��(int, double, char)�� ���ڿ��� ��ȯ
		//Type mismatch: cannot convert from int to String
		//String data1 = 123;
		String data1 = Integer.toString(123);
		String data2 = Integer.toHexString(123); //16���� 7b�� ��ȯ
		String data3 = Double.toString(3.14);
		String data4 = Character.toString('a');
		String data5 = Boolean.toString(true);
	}
}
