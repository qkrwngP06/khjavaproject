package com.kh.day10.exercise;

public class GoodCalc extends Calculator{
	@Override
	public int add(int a, int b) {
		/*
		 * int result = a + b;
		 * return result;
		 */
		return a + b;
	}

	@Override
	public int substract(int a, int b) {
		return a - b;
	}

	@Override
	public double average(int[] a) {
		//a = {1, 2, 3} -> {1, 2, 3, 4, 5}
		//int sum = a[0] + a[1] + a[2];
		//double avg = sum/(double)3;
		//return avg;
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		double avg = sum / (double)a.length;
		return avg;
	}
	
	public static void main(String[] args) {
		GoodCalc calc = new GoodCalc();
		//int [] a = new int [5];
		//a[0] = a[1] = a[2] = a[3] = a[4] = 1;  
		//�迭���� �Ҵ�� �ʱ�ȭ�� ������ �� ����
		int [] a = {1, 2, 3 ,4, 5};
		System.out.println("��: " + calc.add(1, 2));
		System.out.println("��: " +calc.substract(5, 3));
		System.out.println("���: " +calc.average(a));
	}

}
