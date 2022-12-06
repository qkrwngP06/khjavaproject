package com.kh.day08.oop;

public class Suit {
	//호출 순서 (3) -> (2) -> (1)
	private int size;
	private String brand;
	private int price;
	
	//시작
	public Suit(int size) {
		this(size, "Hazzys"); //100
		System.out.println("Suit(int) 호출!!");     //(1)
	}
	public Suit(int size, String brand) {
		this(size, brand, 100000);  //100 Hazzys
		System.out.println("Suit(int, String) 호출");    //(2)
	}
	public Suit(int size, String brand, int price) {  //100 Hazzys 100000
		this.size = size;
		this.brand = brand;
		this.price = price;
		System.out.println("Suit(int, String, int) 호출");    //(3)
	}

}
