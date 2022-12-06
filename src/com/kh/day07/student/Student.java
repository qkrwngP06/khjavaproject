package com.kh.day07.student;

public class Student {
	//이 클래스는 StudentFunction 클래스랑만 관련있음
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Student() {
		
	}
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	//setter메소드
	//멤버변수 각각 초기화
	public void setName(String name) {
		this.name = name;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	//getter메소드
	//멤버변수 값 리턴
	public String getName() {
		return this.name;  //this.name만 하면 값이 없어짐, return적어줌(반환), void -> String
	}
	public int getKor() {
		return this.kor;
	}
	public int getEng() {
		return this.eng;
	}
	public int getMath() {
		return this.math;
	}
}
