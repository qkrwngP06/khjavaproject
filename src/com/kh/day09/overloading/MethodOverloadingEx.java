package com.kh.day09.overloading;

class Weapon {
	// �����ε�
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

	// �����ε�
	// �ڱ� �ڽſ��� ����, �Ű����� Ÿ�� or ������ �޶���
	class Cannon extends Weapon {
		@Override
		protected int fire() {
			return 10;
		}
	}

	protected int fire(int steampack) {
		return steampack * 100; // �����ε�
	}

	protected int fire(int steampack, int medicine) {
		return steampack + medicine; // �����ε�(�����ٸ���)
	}

	protected int fire(String steampack) {
		System.out.println(steampack); // �����ε�(Ÿ�Դٸ���)
		return 1;
	}
}

public class MethodOverloadingEx {
	public static void main(String[] args) {
		System.out.println();
	}

}
