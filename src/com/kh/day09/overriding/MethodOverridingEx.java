package com.kh.day09.overriding;

public class MethodOverridingEx {
	
	static void paint(Shape p) {
		//Shape p = new Line();
		p.draw(); //�θ�
	}
	
	public static void main(String [] args) {
		Line line = new Line();
		//line.draw();
		//paint(line);   //Line
		paint(new Rect());  //�������̵��� �ȵ� ���·� ȣ���ϸ�
		                    //���: Shape
							//�������̵��� �Ǹ� Rect���
		paint(new Circle());  //���: Shape(�������̵� x)
							//�������̵� �Ǹ� Circle
	}

}
