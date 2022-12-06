package com.kh.day10.interfaceex;

public interface PhoneInterface {
	//1. Illegal modifier for the interface field PhoneInterface.name; 
	//only public, static & final are permitted(private ����)
	public String name =" ";
	public String NAME ="";  //static final �����Ǿ�����
	//name = "Hello World"; X, ������̶� �ٲ��� ����
	public static final int TIME_OUT = 10000;
	public abstract void sendCall();
	public abstract void receiveCall();
	//2. Abstract methods do not specify a body
	//public void printLogo() {}
	public abstract void printLogo();
	void displayNumber();
	//abstract void printLogo();
	//public void printLogo();
	
;	public default void showLogo() {  //����Ʈ �޼ҵ�
		//���� ȣȯ���� ���ؼ� �ۼ��Ѵ�
		//��, ���� ȣȯ���� �����ϰ� �������̽��� ������ ���� �ۼ�
		System.out.println("** LG **");
	}

}
