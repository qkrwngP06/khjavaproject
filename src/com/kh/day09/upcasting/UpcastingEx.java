package com.kh.day09.upcasting;

public class UpcastingEx {
	public static void main(String [] args){
		Person p;
		Student s = new Student("일용자");
		//p = new Person("");
		p = s; //업캐스팅(부모타입의 변수)
		
		System.out.println(p.name);
		//자식
		//System.out.println(p.grade);
		//grade cannot be resolved or is not a field
		//System.out.println(p.department);
		//department cannot be resolved or is not a field
		
		//다운캐스팅(자식에 있는거 접근할때)
		System.out.println(((Student)p).grade);
		System.out.println(((Student)p).department);
		
		
	}
}
