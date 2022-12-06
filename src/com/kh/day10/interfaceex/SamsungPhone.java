package com.kh.day10.interfaceex;

public class SamsungPhone implements PhoneInterface {
	// 1. extends 사용 : The type PhoneInterface cannot be the superclass of
	// SamsungPhone;
	// a superclass must be a class
	// 2.The type SamsungPhone must implement the inherited abstract method
	// PhoneInterface. receiveCall()
	//추상메소드들 오버라이딩함
	@Override
	public void sendCall() {  //추상메소드
		System.out.println("뚜루루루루");
	}

	@Override
	public void receiveCall() {
		System.out.println("여보세요 나야");
	}

	@Override
	public void printLogo() {
		System.out.println("====== Samsung ======");
	}

	@Override
	public void displayNumber() {
		System.out.println("내 휴대전화 정보 : xxx-xxxx-xxxx");
	}
	public void flash() {
		System.out.println("반짝반짝 불이 켜졌습니다.");
	}
}
