package com.kh.day10.abstractex;

class Line extends Shape{
	//The type Line must implement the inherited (오류)
	//abstract method Shape.draw()
	//오류 없애는 방법
	//1.오버라이딩을 하던가
	//2.추상클래스로 만들어 주던가 
	//abstract class Line extends Shape{}
	@Override
	public void draw() {
		
	}
}
abstract public class Shape {
	public Shape() {}    //생성자
	public void paint() {}
	
	//abstract public void draw() {} 
	//Abstract methods do not specify a body(오류)
	
	abstract public void draw();  //추상메소드
	//The abstract method draw in type Shape (오류)
	//can only be defined by an abstract class
	//메인 클래스에 abstract를 붙여주면 오류 사라짐

}
