package com.kh.day04.exercise;

public class Exercise_Printsample {
	public static void main(String[] args) {
		//���� ����Ű: ctrl + d
		// System.out.println���� ���� + ���ڿ� -> ���ڿ�
		System.out.println(1 + "1"); //11
		//���� + ���� -> ����
		System.out.println('1' + '1');  //49 + 49 = 98  �ƽ�Ű�ڵ�� ��ȯ�� �Ǿ� ����
		//���� + ���� + ���ڿ� + ���� -> ���������δ� ���ڿ�
		System.out.println(10 + 20 + "Hello" + 10);
		
		//printf�� ���Ͽ� �˾ƺ���
		//println,print -> �ٹٲ��� ����
		System.out.print("���� �Է�: "); //�ٷ� ���� �Է¹���
		System.out.println("���� �Է�: ");  //�ٹٲٰ� �Է¹���
		System.out.printf("���� ���: %d\n",1); //������ %d , \n->�ٹٲ�
		System.out.printf("���ڿ� ���: %s", "Hello World"); //���ڿ� %s
	}

}
