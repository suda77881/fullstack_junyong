package com.company.java002_ex;

public class VarEx002 {
	
	public static void main(String[] args) {
		int a;
		a = 10;
		int b;
		b = 3;
		System.out.println(a+" + "+b+" = "+(a+b));
		System.out.println(a+" - "+b+" = "+(a-b));
		System.out.println(a+" * "+b+" = "+(a*b));
		System.out.println(a+" / "+b+" = "+(a/b));
		
		
		double c = 10.0;
		double d = 3.0;
				
		
		System.out.println(a+" / "+b+" = "+(c));
		
		System.out.printf("%d+%d=%d\n", a, b, a+b	);
		System.out.printf("%d-%d=%d\n", a, b, a-b	);
		System.out.printf("%d*%d=%d\n", a, b, a*b	);
		System.out.printf("%d/%d=%d\n", a, b, a/b	);
		
		System.out.println(c/d);
		/* System.out.println(c/d+","+a%b+","+c); */
		
		
	}
}
