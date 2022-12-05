package com.kh.day09.insof;

public class InstanceOfEx {
	
	static void print(Person p) {  //Person객체를 만나야만 동작을 함 
		//Person p = new Student();
		//if(p instanceof Person)
		//System.out.println("Person입니다!!");
		if(p instanceof Student)
			System.out.println("Student입니다!!");
		if(p instanceof Researcher)
			System.out.println("Researcher입니다!!");
		if(p instanceof Professor)
			System.out.println("Professor입니다!!");
	}
	public static void main(String [] args) {
		//print(new Person());  
		
		//오류가 안난다.
		//업캐스팅(Person을 상속받은 거라 실행이 됨)
		//Student에서 extends Person을 빼면 오류가남
		//Person p = new Student();
		//The method print(Person) in the type InstanceOfEx is not applicable for the arguments (Student)
		print(new Student());
		print(new Researcher());
		print(new Professor());  //Researcher가 Person의 상속을 받아서 오류 안남
	}
}
