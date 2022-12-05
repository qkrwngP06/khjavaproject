package com.kh.day09.point;

public class ColorPointEx {
	public static void main(String [] args) {
		//기본생성자가 없을 때 기본 생성자를 사용하려고 하면 오류남
		//ColorPoint에서 public ColorPoint(){} 기본생성자 만들어줘야함
		//The constructor ColorPoint() is undefined(오류)
		//ColorPoint cp = new ColorPoint(); 
		
		ColorPoint cp = new ColorPoint(5, 6, "blue");  //생성자를 이용하여 값을 초기화 하면서 값을 넣음
		
		//상속을 이용안함
		//cp.set(3, 4);  //Point의 set() 호출 메소드를 이용해서 값을 넣음
		//cp.setColor("red");  //ColorPoint의 setColor() 호출
		cp.showColorPoint();  //컬러와 좌표 출력
	}
}
