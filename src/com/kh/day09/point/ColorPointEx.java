package com.kh.day09.point;

public class ColorPointEx {
	public static void main(String [] args) {
		//�⺻�����ڰ� ���� �� �⺻ �����ڸ� ����Ϸ��� �ϸ� ������
		//ColorPoint���� public ColorPoint(){} �⺻������ ����������
		//The constructor ColorPoint() is undefined(����)
		//ColorPoint cp = new ColorPoint(); 
		
		ColorPoint cp = new ColorPoint(5, 6, "blue");  //�����ڸ� �̿��Ͽ� ���� �ʱ�ȭ �ϸ鼭 ���� ����
		
		//����� �̿����
		//cp.set(3, 4);  //Point�� set() ȣ�� �޼ҵ带 �̿��ؼ� ���� ����
		//cp.setColor("red");  //ColorPoint�� setColor() ȣ��
		cp.showColorPoint();  //�÷��� ��ǥ ���
	}
}
