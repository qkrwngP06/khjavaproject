package com.kh.day11.javaapi;

import java.util.StringTokenizer;

public class Exam_StringTokenizer {
	public static void main(String [] args) {
		String query = "name=kite&addr=seoul&age=21";
		//String [] words = query.split("&");
		//StringTokenizer st = new StringTokenizer(query, "&");
		/*
		name=kite
		addr=seoul
		age=21*/
		StringTokenizer st = new StringTokenizer(query, "&=");
		/*
		name
		kite
		addr
		seoul
		age
		21*/
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
