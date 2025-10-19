package com.company.java014_ex;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;


//1. UserInfo2    Dto 클래스만들기  - 속성 : private int no; private  String name; private  int age;
class UserInfo23 {
	private int no; 
	private String name; 
	private int age;
	
	// 기본생성자
	public UserInfo23() { super();}

	// 필드생성자
	public UserInfo23(int no, String name, int age) { super(); this.no = no; this.name = name; this.age = age; } 

	// toString
	@Override public String toString() { return "UserInfo2 [no=" + no + ", name=" + name + ", age=" + age + "]"; }
	
	// getters setters
	public int getNo() { return no; } public void setNo(int no) { this.no = no; }
	public String getName() { return name; } public void setName(String name) { this.name = name; }
	public int getAge() { return age; } public void setAge(int age) { this.age = age; }

	
	// HashCode
	
	@Override
	public int hashCode() { return Objects.hash(age, name, no); }

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserInfo23 other = (UserInfo23) obj;
		return age == other.age && Objects.equals(name, other.name) && no == other.no;
	}
	
}


public class SetEx001_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	Set<UserInfo23> users = new HashSet<>();
		
		
		int i = 0;
		users.add(new UserInfo23(1, "아이언맨", 50));
		users.add(new UserInfo23(2, "헐크" ,   40)); 
		users.add(new UserInfo23(3, "캡틴" ,  120)); 
		users.add(new UserInfo23(3, "캡틴" ,  120));
		System.out.println("이름 입력 > "); String tempName = sc.next();
		for (UserInfo23 l : users) {
			
			if (tempName.equals( l.getName())) {
				
				System.out.println(l);
			}
			i += l.getAge();		
		}
		
		
		System.out.println(users);

		System.out.println(i/users.size());
		

	}
	
	


}


//com.company.java014_ex
//클래스명 : SetEx001

//2. users   HashSet만들기
//3. 다음의 데이터 넣기
//   new UserInfo2(1, "아이언맨" , 50) , 
//   new UserInfo2(2, "헐크" , 40) , 
//   new UserInfo2(3, "캡틴" , 120), 
//   new UserInfo2(3, "캡틴" , 120)
//4. 향상된 for / Interator 이용해서 데이터 출력 (3명만 출력되게- 같은자료 중복안되게)
//5. 사용자들의 이름 입력받기 - 이름을 입력받으면 해당하는  유저의 자료출력
//6. 사용자들의 나이 평균처리