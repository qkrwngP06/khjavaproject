package com.kh.day11.javaapi;

import java.util.StringTokenizer;

public class Exercise_StringTokenizer {
	public void exercise1() {
		// ȫ�浿/��ȭ/ȫ��/����/������ ���ڿ� �����͸�
		// '/'�������� �߶� ȫ�ø� ����Ͻÿ�
		String data = "ȫ�浿/��ȭ/ȫ��/����/����";
		//1.��ü ���
		StringTokenizer st = new StringTokenizer(data, "/");
		while(st.hasMoreTokens()) {
			//2.ȫ�ø� ���
			if(st.nextToken().equals("ȫ�浿"))
			//System.out.println(st.nextToken());
				System.out.println("ȫ��");
		}
		
		
	}
	

}
