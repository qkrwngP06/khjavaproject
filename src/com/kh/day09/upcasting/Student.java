package com.kh.day09.upcasting;

public class Student extends Person{
	//Implicit super constructor Person() is undefined for default constructor. 
	//Must define an explicit constructor
	//->�⺻ ������ �ۼ����� �ʾƼ� �߻�
	String grade;
	String department;
	
	public Student(String name) {
		super(name);
	}
}
