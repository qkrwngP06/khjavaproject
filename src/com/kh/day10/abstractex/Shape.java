package com.kh.day10.abstractex;

class Line extends Shape{
	//The type Line must implement the inherited (����)
	//abstract method Shape.draw()
	//���� ���ִ� ���
	//1.�������̵��� �ϴ���
	//2.�߻�Ŭ������ ����� �ִ��� 
	//abstract class Line extends Shape{}
	@Override
	public void draw() {
		
	}
}
abstract public class Shape {
	public Shape() {}    //������
	public void paint() {}
	
	//abstract public void draw() {} 
	//Abstract methods do not specify a body(����)
	
	abstract public void draw();  //�߻�޼ҵ�
	//The abstract method draw in type Shape (����)
	//can only be defined by an abstract class
	//���� Ŭ������ abstract�� �ٿ��ָ� ���� �����

}
