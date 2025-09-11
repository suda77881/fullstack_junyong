package com.company.java006;

public class Arr001 {
	public static void main(String [] args) {
		//1. 변수 활용시
		int a=1, b=2, c=3;
		
		//2. 배열?
		// [같은타입] 의 데이터를 [연속된 공간에 저장] 하는 자료구조 Array?   
		// 각 데이터의 저장위치 [인덱스]를 통해서 접근
		// 1) int [] arr 주소를 보관할 준비됐어요~!			2) null 공간은 있지만 값이 없어요!
		int [] arr = null ;
		System.out.println(arr);
		
		// [stack] arr2 주소보관 = [heap] 1,2,3 연속된 공간에 저장  
		int          [] arr2   = {1,2,3};
		//arr2(1000번지)	       → 1000번지{ 1, 2, 3} 
		//								 [0][1][2]
		System.out.println(arr2);
		System.out.println("1꺼내쓰기 > " + arr2[0]);
		System.out.println("2꺼내쓰기 > " + arr2[1]);
		System.out.println("3꺼내쓰기 > " + arr2[2]);
		
		//3. 배열예시(1) : arr3 1 2 3 4 5
		
		int [] arr3 = { 1,2,3,4,5 };	//	0~4
		System.out.println(arr3[2]); // 3
		
		//3. 배열예시(2) : arr4 100,200,300
		
		
		int [] arr4 = {100,200,300};
		
		System.out.println(arr4[0]);
		
		//3. 배열예시(3) : arr4 1.1,1.2,1.3
		
		
		double [] arr5 = {1.1,1.2,1.3};	//	0~2
		
		System.out.println(arr5[2]);
	
//		System.out.println(arr5[0]);
		
		//3. 배열예시(4) : arr4 'a','b','c'
		
		
		char [] arr6 = {'a','b','c'};	//	0~2
		
		System.out.println(arr6[0]);
		System.out.println(arr6[1]);
		System.out.println(arr6[2]);
		
		//4. 배열.length
		System.out.println(arr6.length);	//	배열갯수 출력
		// {반복}	{변수}	for(시작;종료;변화)
		
		for(int i=0; i<=2; i++)	{	System.out.println(arr6[i]);	}
		
		System.out.println();
		for(int i=0; i<arr6.length; i++)	{	System.out.println(arr6[i]);	}
		
		
		
	}
}
