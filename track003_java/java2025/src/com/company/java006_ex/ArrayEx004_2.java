package com.company.java006_ex;

public class ArrayEx004_2 {

	public static void main(String[] args) {
		
		int upper = 0, lower =0;
		
		char[] ch = { 'B', 'a', 'n', 'a', 'n', 'a' };
		int num = 0;

		for (int i = 1; i <= ch.length - 1; i++) {
			if (ch[i] == 'a') {
				num++;
			} else {
				System.out.print("");
			}

		}
		System.out.println("a의 갯수 : " + num);
		
		
		for(int i=0; i<ch.length; i++)
		{	 if(ch[i]>='A' && ch[i]<='Z') {upper++;}
		else if(ch[i]>='A' && ch[i]<='Z') {upper++;}
		}
		
		
		
		//출력 - 대문자의 갯수카운트, 소문자의 갯수 카운트
		System.out.println("대문자>" + upper + "소문자>" + lower);
		}

}
