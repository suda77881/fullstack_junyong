package com.company.java014;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

// 1. 콜렉션 프레임 워크 - [배열]의 단점을 개선한 [객체]만 저장가능 [동적배열]
// 2. List, Set, Map
// List (기차) - index 순서 O , 중복허용 O , add / get(순서) / size / remove(순서) / contains
// Set (주머니) - index 순서 x , 중복허용 X , add / 향상된 for, iterator / size / remove(객체) / contains

class Candy2{
	String name;
	int    price;
	public Candy2() { super(); }
	public Candy2(String name, int price) { super(); this.name = name; this.price = price; }	
	
	@Override public String toString() { return "Candy2 [name=" + name + ", price=" + price + "]"; }
	// 1. Candy2 클래스 확인용도
	@Override public int hashCode() { return Objects.hash(name, price); }
	// 2. 사용자가 넣어준값을 비교
	@Override public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Candy2 other = (Candy2) obj;
		return Objects.equals(name, other.name) && price == other.price;
	}
	
}
public class Set001_2 {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
		set1.add(new Integer(1)); // Integer e = new Integer(1) (부품객체)
		set1.add(1);			  // Integer e = 1	 ( 기본값 )
		set1.add(1);			  // 부품객체     = 기본값	(Integer - wrapper 클래스)
		set1.add(2);		      // 기본값을 자동으로 - 객체화 - 부품객체 (wrapper 클래스)
		set1.add(3);			  // int → Integer , float → Float 오토박싱.
		System.out.println( set1 );
		
		Set<Candy2> set2 = new HashSet<>();
		set2.add(new Candy2("츕파츕스"		, 300));
		set2.add(new Candy2("츕파츕스"		, 300));
		set2.add(new Candy2("츕파츕스"		, 300));
		set2.add(new Candy2("청포도알사탕"	, 4500));
		set2.add(new Candy2("멘톨"			, 5500));
		System.out.println(set2);
		System.out.println(set2.size());
		
	}

}
