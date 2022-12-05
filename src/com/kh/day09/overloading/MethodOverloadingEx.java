package com.kh.day09.overloading;

class Weapon {
	// 오버로딩
	public Weapon() {
	}

	public Weapon(int value) {
		System.out.println(value);
	}

	public Weapon(int value, String name) {
		System.out.println(value + ":" + name);
	}

	protected int fire() {
		return 1;
	}

	// 오버로딩
	// 자기 자신에게 복붙, 매개변수 타입 or 갯수가 달라짐
	class Cannon extends Weapon {
		@Override
		protected int fire() {
			return 10;
		}
	}

	protected int fire(int steampack) {
		return steampack * 100; // 오버로딩
	}

	protected int fire(int steampack, int medicine) {
		return steampack + medicine; // 오버로딩(개수다르게)
	}

	protected int fire(String steampack) {
		System.out.println(steampack); // 오버로딩(타입다르게)
		return 1;
	}
}

public class MethodOverloadingEx {
	public static void main(String[] args) {
		System.out.println();
	}

}
