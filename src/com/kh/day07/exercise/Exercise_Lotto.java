package com.kh.day07.exercise;

import java.util.Random;

public class Exercise_Lotto {
	public void lototoProgram() {
		//로또 번호 자동 생성기 프로그램, 중복 없이 추출하기!!
		//단, 결과는 오름차순으로 정렬
		//로또 번호는 몇 개>? 6개!!
		//로또 번호의 범위는? 1 ~ 45
		
		int [] lottos = new int[6];
		Random rand = new Random();
		//번호를 뽑는다.(6번 반복)
		for(int i = 0; i < lottos.length; i++) {
			//번호를 뽑는다.
			//1 ~ 45 -> 0 ~ 44 ->(+1) 1 ~ 45
			lottos[i] = rand.nextInt(45) + 1;
			//중복제거
			for(int j = 0; j < i; j++) {
				// 비교를 한다 점점 많아진다.
				//비교는 이미뽑은 것과 첫번째부터~
				if(lottos[i] == lottos[j]) {
					// 같으면 i--;
					i--;
					break;
				}
			}
		}
		
		//정렬(버블정렬)
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
