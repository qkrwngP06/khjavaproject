package com.kh.day07.run;

import java.util.Scanner;

import com.kh.day07.exercise.Exercise_Lotto;
import com.kh.day07.oop.Person;
import com.kh.day07.oop.Rectangle;

public class Run {
	public static void main(String [] args) {
		//Exercise_Lotto exLotto = new Exercise_Lotto();
		//exLotto.lototoProgram();
		
		Person person = new Person();
		/*
		person.eat();
		person.sleep();
		person.speak();
		person.walking();
		*/
		//person.name = "�Ͽ���";  //private�� ������ �ȵ�
		//person.jobName = "�ǻ�"; //public�� ���� ����
		
		Scanner sc = new Scanner(System.in);
		
		//���۷��� ���� ����(����)
		//���� ���� ����
		//�ּҰ� ����Ǵ� ����
		Rectangle rect = new Rectangle();  //��ü����, �ݵ�� new Ű���� �̿�(������)
		 								  // new�� ��ü�� ������ ȣ��
		System.out.print("�ʺ� �Է����ּ���.");
		//��ü�� ��� ���� (����� �����δ� ��� ����(�ʵ忡 �ִ°�)�� ��� �޼ҵ�)
		//�ν��Ͻ�(Rectangle Ŭ������ ��ü)
		rect.width = sc.nextInt(); //��ü�� ��� ������ .���� �Ѵ�. ������� ����
		System.out.print("���̸� �Է����ּ���.");
		rect.height = sc.nextInt(); //������� ����
		int result = rect.getArea(); //����޼ҵ� ����
		System.out.println("�簢���� ������: " + result);
	} 

}