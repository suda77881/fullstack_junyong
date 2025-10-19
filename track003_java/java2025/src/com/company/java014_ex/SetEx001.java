package com.company.java014_ex;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;
//1 /2
//set : 순서 X, 중복허용 X

class UserInfo2{
	// Q1. 생성자, 필드생성자, toString, getters/setters , hashCode / equals
	private int    no;
	private String name;
	private int    age;
	public UserInfo2() { super(); }
	public UserInfo2(int no, String name, int age) { super(); this.no = no; this.name = name; this.age = age; }
	@Override 
	public String toString() { return "UserInfo2 [no=" + no + ", name=" + name + ", age=" + age + "]"; } 
	public int getNo() { return no; } public void setNo(int no) { this.no = no; } public String getName() { return name; } public void setName(String name) { this.name = name; } public int getAge() { return age; } public void setAge(int age) { this.age = age; }
	// 클래스 UserInfo2 인지확인
	@Override 
	public int hashCode() { return Objects.hash(age, name, no);}
	// 인스턴스안의 값확인
	@Override 
	public boolean equals(Object obj) { if (this == obj) return true; if (obj == null) return false; if (getClass() != obj.getClass()) return false; UserInfo2 other = (UserInfo2) obj; return age == other.age && Objects.equals(name, other.name) && no == other.no; }
	
}

public class SetEx001 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<UserInfo2> sets = new HashSet<>();
		// Q3. sets에 UsersInfo2 데이터 넣기
		sets.add(new UserInfo2(1, "아이언맨", 50));
		sets.add(new UserInfo2(2, "헐크" , 40)); 
		sets.add(new UserInfo2(3, "캡틴" , 120)); //주소
		sets.add(new UserInfo2(3, "캡틴" , 120)); // 주소
		// Q4. 향상된 for / Interator 이용해서 데이터 출력 (3명만 출력되게 - 같은자료 중복안되게) equals/ hashcode
//		System.out.println(sets.size()); // 3
		double avg = 0.0;
		int    total = 0;
		for (UserInfo2 u : sets) {
//			System.out.println(u);
			System.out.println(u.getNo() + "-" + u.getName() + "-" + u.getAge());
			total += u.getAge();
			}
		
		//Q5. 사용자들의 이름 입력받기 - 이름을 입력받으면 해당하는 유저의 자료 출력
		System.out.println("이름을 입력해주세요 "); String name = sc.next();
		for (UserInfo2 u : sets) {
			if (u.getName().equals(name)){
				System.out.println(u);break;
			}
			}
		
		//Q6. 사용자들의 나이 평균처리
		
		System.out.println(avg = total/3.0);

			}
			
		
			
	


	}


