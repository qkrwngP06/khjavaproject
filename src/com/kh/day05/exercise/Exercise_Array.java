package com.kh.day05.exercise;

import java.util.Scanner;

public class Exercise_Array {
	public void exercise1() {
		// ���̰� 100�� �迭�� �����ϰ� 1���� 100������ ����
		// ������� �־� �� ���� ����ϴ� �ڵ带 �ۼ��Ͻÿ�
		int[] nums = new int[100];  //���̰� 100�� �迭 ����
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i;
			System.out.print(nums[i]);
		}
	}

	public void exercise2() {
		// ���̰� 5�� String �迭�� �����ϰ�
		// "����", "������", "Ű��", "���","�ٳ���"�� �ʱ�ȭ �� ��,
		// for���� Ȱ���ؼ� �ٳ����� ������ �ٳ����� ���
		String[] fruits = new String[5];
		fruits[0] = "����";
		fruits[1] = "������";
		fruits[2] = "Ű��";
		fruits[3] = "���";
		fruits[4] = "�ٳ���";
		/*
		for (int i = 0; i < fruits.length; i++) {
			if (fruits[i] == "�ٳ���") {
				System.out.print(fruits[i] + " ");
			}
		}*/
		//���� �� ���ϰ�! -> �Ҵ�� �ʱ�ȭ ���ÿ�!!
		String [] fruitGoods = {"����", "������", "Ű��", "���", "�ٳ���"};
		for (int i = 0; i < fruitGoods.length; i++) {
			if (fruitGoods[i] == "�ٳ���") {
				System.out.print(fruitGoods[i] + " ");
			}
		}
	}
	
	public void exercise3() {
		//���� ���� 5���� �Է¹޾� �迭�� �����ϰ�
		//�Է¹��� ������ ����� ���ϴ� ���α׷� �ۼ�
		
		int [] arrs = new int[5];
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� 5�� �Է�:");
		for(int i = 0; i < arrs.length; i++) {
			arrs[i] = sc.nextInt();
			sum = sum + arrs[i]; //sum += arrs[i];
		}
		//����� ����/�������� ����, 1,2 ->  1 + 2 / 2 = 1.5
		System.out.println("����� " + (double)sum / arrs.length + "�Դϴ�.");
	}
	
	public void exercise4() {
		//���� ���� 5���� �Է¹޾� �迭�� �����ϰ�
		//���� ū ���� ����ϴ� ���α׷��� �ۼ�
		
		int [] arrs = new int[5];
		int max = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� 5�� �Է�:");
		for(int i = 0; i < arrs.length; i++) {
			arrs[i] = sc.nextInt();
			if(arrs[i] > max ) {
				max = arrs[i];
			}
		} 
		System.out.println("���� ū ���� " + max + "�Դϴ�.");
	}
	
	public void exercise5() {
		//����ڿ��� �ֹι�ȣ�� �Է� ���� ��
		//���� �ڸ� ���ĺ��� *�� ����Ǿ� ��µǵ��� ���α׷� �ۼ�
		//210618-1124600 -> 210618-1******
		//200518-3233920 -> 20518-3******
		
		Scanner sc = new Scanner(System.in);
		char [] origin = new char[14];
		System.out.print("�ֹε�Ϲ�ȣ �Է�(-����): ");
		String memberNum = sc.next();
		
		//String���� �Է¹��� ���� �ϳ��� �߶� origin ���ڹ迭�� �ֱ�!
		for(int i = 0; i < origin.length; i++) {
			origin[i] = memberNum.charAt(i);
			//System.out.print(origin[i]);
		}
		/*
		char [] copy = origin; //���� ����, �̷��� �ǵ��� ���� �ƴϴ�!
		for(int i = 0; i < origin.length; i++) {  //������ �� ����
			if(i > 7) {
				copy[i] = '*';
			}
			//System.out.print(origin[i]);
			System.out.print(copy[i]);
		}
		System.out.println();
		for(int i = 0; i < origin.length; i++) {   //���� ���
			System.out.print(origin[i]);
		}*/
		
		char [] copy = new char[14]; //���� ������ ����!
		for(int i = 0; i < origin.length; i++) {  //������ �� ����
			if(i < 8) {
				copy[i] = origin[i];  //���� ����
			} else
				copy[i] = '*';
				
			//System.out.print(origin[i]);
			System.out.print(copy[i]);
		}
		System.out.println();
		for(int i = 0; i < origin.length; i++) {   //���� ���
			System.out.print(origin[i]);
		}
	}
	//forEach��1
	public void exercise6() {
		int [] nums = {1, 2, 3, 4, 5};   //�Ҵ�� �ʱ�ȭ ���ÿ�
		for(int num : nums) {
			System.out.print(num + " ");
		}
	}
	//forEach��2
	public void exercise7() {
		String [] fruits = {"����", "������", "����", "ü��", "����"};
		for(String fruit : fruits) {
			System.out.print(fruit + " ");
		}
	}
}
