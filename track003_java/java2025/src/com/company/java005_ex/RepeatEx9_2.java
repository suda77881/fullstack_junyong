package com.company.java005_ex;

public class RepeatEx9_2 {

	public static void main(String[] args) {

		int num = 0;
		for (int i = 1; i <= 10; i++) {

//			if (i % 3 == 0) {
//				num += i;
//			}
			num += (i % 3 == 0) ? i : +0;			
//			System.out.println(num);
//			switch (i){
//			
//			case 3 : {System.out.print(num + "+\n");}
//			case 6 : {System.out.print(num + "+\n");}
//			case 9 : {System.out.print(num + "=\n");}
//			case 10 : {System.out.print(num);}
//			}
			
//			if (i == 3) {System.out.print(i + "+");}
//			else if (i == 6 ) {System.out.print(i + "+");}
//			else if (i == 9 ) {System.out.print(i + "=");}
//			else if (i == 10 ) {System.out.print(num);}
			
			
			switch (i) {
			
			case 3 : {System.out.print(i + "+");}break;
			case 6 : {System.out.print(i + "+");}break;
			case 9 : {System.out.print(i + "=");}break;
			case 10 : {System.out.print(num);}break;
			
				}
			}
		
		System.out.println("");
		
		int hap =0;
		for(int i=1; i<=10; i++) {
			if(i%3==0) {
				hap += i;
				System.out.print((i==3? "" : "+")+ i);
			}
		}
		System.out.println("=" + hap);
			
		
//		System.out.println(num);

		num = 0;
		int i = 1;

		while (i <= 10) {
//			if (i % 3 == 0) {
//				num += i;
//				
//			}
			num += (i % 3 == 0) ? i : +0;
			
			
			if (i == 3) {System.out.print(i + "+");}
			else if (i == 6 ) {System.out.print(i + "+");}
			else if (i == 9 ) {System.out.print(i + "=");}
			else if (i == 10 ) {System.out.print(num);}
			
			

			i++;
		}
//		System.out.println(num);
		System.out.println("");

		i = 1;
		num = 0;

		do {
//			if (i % 3 == 0) {
//				num += i;

//			}
			num += (i % 3 == 0) ? i : +0;
			
			if (i == 3) {System.out.print(i + "+");}
			else if (i == 6 ) {System.out.print(i + "+");}
			else if (i == 9 ) {System.out.print(i + "=");}
			else if (i == 10 ) {System.out.print(num);}

			i++;
		} while (i <= 10);

//		System.out.println(num);

	}

}
