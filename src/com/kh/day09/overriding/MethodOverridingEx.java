package com.kh.day09.overriding;

public class MethodOverridingEx {
	
	static void paint(Shape p) {
		//Shape p = new Line();
		p.draw(); //부모
	}
	
	public static void main(String [] args) {
		Line line = new Line();
		//line.draw();
		//paint(line);   //Line
		paint(new Rect());  //오버라이딩이 안된 상태로 호출하면
		                    //결과: Shape
							//오버라이딩이 되면 Rect출력
		paint(new Circle());  //결과: Shape(오버라이딩 x)
							//오버라이딩 되면 Circle
	}

}
