package com.kh.day07.exercise;

import java.util.Random;

public class Exercise_Lotto {
	public void lototoProgram() {
		//�ζ� ��ȣ �ڵ� ������ ���α׷�, �ߺ� ���� �����ϱ�!!
		//��, ����� ������������ ����
		//�ζ� ��ȣ�� �� ��>? 6��!!
		//�ζ� ��ȣ�� ������? 1 ~ 45
		
		int [] lottos = new int[6];
		Random rand = new Random();
		//��ȣ�� �̴´�.(6�� �ݺ�)
		for(int i = 0; i < lottos.length; i++) {
			//��ȣ�� �̴´�.
			//1 ~ 45 -> 0 ~ 44 ->(+1) 1 ~ 45
			lottos[i] = rand.nextInt(45) + 1;
			//�ߺ�����
			for(int j = 0; j < i; j++) {
				// �񱳸� �Ѵ� ���� ��������.
				//�񱳴� �̹̻��� �Ͱ� ù��°����~
				if(lottos[i] == lottos[j]) {
					// ������ i--;
					i--;
					break;
				}
			}
		}
		
		//����(��������)
		for(int i = 0; i < lottos.length-1; i++) {
			for(int j = 0; j < (lottos.length-1)-i; j++) {
				if(lottos[j] > lottos[j+1]) {
					int tmp = lottos[j+1];
					lottos[j+1] = lottos[j];
					lottos[j] = tmp;
				}
			}
		}
		for(int i = 0; i < lottos.length; i++) {
			System.out.print(lottos[i] + " ");
		}
	}

}
