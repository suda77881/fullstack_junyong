package com.company.java010_ex;

//-- class Student 작성해주세요
//
//- 문제 1. 다음 코드에서 인스턴스변수, 클래스변수, 지역변수를 구분하시오.  ( 보관되는 영역도 추가 )
// (heap) name, kor, eng //  (method) studentCount, total, maxScore // (stack) args, s1, s2
//- 문제 2. 인스턴스메서드와 클래스메서드를 구분하시오.
// Student(), getTotalScore(), showInfo(), showInfo() // showStudentCount(), showName()
//- 문제 3. 오류가 발생하는 이유를 설명하시오.
// static int total = kor + eng;  // 클래스 변수는 바로 사용가능한 상태이기 떄문에 객체 생성이전에 사용가능해야한다?
// 클래스 변수에 인스턴스 변수 대입불가
// public static void showName() {System.out.println(name);} // class 메서드 안에서 인스턴스변수 사용불가
//- 문제 4. runtime data area 위치영역 그림그리기
// 
//=============== runtime data area
// 		method 정보 = 클래스 정보들
// heap area 인스턴스정보들     |   stack area 지역정보들
// 초기화 : 		기본값 명시적초기화	초기화블록	 생성자 
// studentCoun   0		=0		   x       0   
// maxScore      0      =100	   X      100
//

class Student {
    String name = "홍길동";        
    int kor = 90;                  
    int eng = 85;                 
    static int studentCount = 0;    

//    static int total = kor + eng;	// 클래스변수 - method area - new x - 생성자 x - static (now)
    								// static 은 인스턴스(this) 사용불가
    static int maxScore = 100;      // 클래스 변수 - method area - new X
    
//    static void total() {
//    	
//    	Student.total = kor + eng;  
//    }
    

    public Student() { // 생성자 ?
        studentCount++;	//	static 사용가능    
    }

    public int getTotalScore() {	// 인스턴스 메서드
        return this.kor + this.eng;        	// 
    }

    public static void showStudentCount() { // 클래스메서드 - method area - new x - 생성자 x - static (now)
        System.out.println("전체 학생 수: " + studentCount);  
    }

   public void showName() { // 클래스메서드 - method area - new X - 생성자 X - static (now)
        // System.out.println(this.name); //※ static 은 인스턴스 (this) 사용불가  
   }

    public void showInfo() {	//	인스턴스 메서드 - heap area - new O - 생성자 - O - 
        System.out.println("이름: " + name);            
        System.out.println("총점: " + getTotalScore());    
    }
}

public class MemberVarEx002 {
    public static void main(String[] args) {
        Student s1 = new Student();     
        Student s2 = new Student();     

        s1.showInfo();                  
        Student.showStudentCount();    
    }
}

/*
 ------------------------[ runtime data area]
 [method 정보, static, final : 공용정보] 

 Student.studentCount	,	Student.maxScore, Student.showStudentCount(), Student.showName
 ---------------------------------------------------------------------------------
 [heap : 동적]					| [stack : 잠깐빌리기]
 
 2번지
 {name=홍, kor=90, eng=85 /		← s2 [2번지]
 getTotalScore() , showInfo()}
                                
 1번지
 {name=홍, kor=90, eng=85 /		← s1 [1번지]
 getTotalScore() , showInfo()}
                              
  			 					| main
 ---------------------------------------------------------------------------------
 */

//초기화 : 		기본값 명시적초기화	초기화블록	 생성자 
//studentCoun   0		=0		   x       0   
//maxScore      0      =100	   X      100


