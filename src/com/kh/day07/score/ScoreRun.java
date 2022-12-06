package com.kh.day07.score;

import java.util.Scanner;

public class ScoreRun {
	public static void main(String [] args) {
		//Scanner sc = new Scanner(System.in);
		ScoreFunction sFunc = new ScoreFunction();  
		//객체 생성,메인함수가 돌아가는 동안 값이 계속 저장되어 있음
		//while안에 작성하게 되면 기존값은 사라짐(무한반복에 포함하지 말아요)
		ByeBye :
		while(true) {
			/*
			sFunc.printMenu();
			int choice = sc.nextInt();*/
			int choice = sFunc.printMenu();
			switch(choice) {
				case 1: 
					sFunc.inputScore();
					break;
				case 2:
					sFunc.printScore();
					break;
				case 3: 
					sFunc.goodByeMsg();
					break ByeBye;
				default :
					sFunc.exceptionMsg();
					break;
			}
		}
	}
}
