package com.company.java014_ex;

import java.util.ArrayList;
import java.util.List;

public class ListEx001 {

	public static void main(String[] args) {
		
		List <String> colors =  new ArrayList <String>();
		
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		//colors.add(1);
		
		System.out.println("1 : " + colors);
		System.out.print("2 : size + get > ");
		for(int i=0; i<colors.size(); i++) {System.out.print(colors.get(i) + "\t");}
		
		
		System.out.print("\n3 : 향상된 for > ");
		for ( String c : colors) {System.out.print(c + "\t");}

	}

}
