package com.kh.day03.typetrans;

public class TestTypeTrans2 {
	public static void main(String[] args) {
		byte b = 127; // 1byte
		int i = 100; // 4byte

		// �ڵ� ����ȯ
		System.out.println(b + i); // b�� int�� �ڵ�����ȯ 127+100
		System.out.println(10 / 4);
		System.out.println(10.0 / 4); // 4�� 4.0(�Ǽ�)�� �ڵ�����ȯ

		System.out.println();
		// ���� ����ȯ -> ū �ڷ����� ���� �ڷ������� ��ȯ, ������ �ս� �߻�!!
		System.out.println((byte) b + i);
		System.out.println((int) 2.9 + 1.8); // 2 + 1.8 -> 2.0 + 1.8
		System.out.println((int) (2.9 + 1.8)); // 4.7 -> 4
		System.out.println((int) 2.9 + (int) 1.8); // 2 + 1
	}
}
