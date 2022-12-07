package com.kh.day11.javaapi;

import java.util.StringTokenizer;

public class Exercise_StringTokenizer {
	public void exercise1() {
		// È«±æµ¿/ÀåÈ­/È«·Ã/ÄáÁã/ÆÏÁãÀÇ ¹®ÀÚ¿­ µ¥ÀÌÅÍ¸¦
		// '/'±âÁØÀ¸·Î Àß¶ó¼­ È«·Ã¸¸ Ãâ·ÂÇÏ½Ã¿À
		String data = "È«±æµ¿/ÀåÈ­/È«·Ã/ÄáÁã/ÆÏÁã";
		//1.ÀüÃ¼ Ãâ·Â
		StringTokenizer st = new StringTokenizer(data, "/");
		while(st.hasMoreTokens()) {
			//2.È«·Ã¸¸ Ãâ·Â
			if(st.nextToken().equals("È«±æµ¿"))
			//System.out.println(st.nextToken());
				System.out.println("È«·Ã");
		}
		
		
	}
	

}
