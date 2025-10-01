package com.company.java013_ex;

/*						board
 * 
 * 		△			△			△			△
 * 	BoardInsert	BoardSelect	BoardUpdate	 BoardDelete
 * 	{@exec()}	{@exec()}	{@exec()}	{@exec()}
 * 
 * 	1. 인터페이스는 설계클래스 (상태 : public static final / 행위 : public abstract)
 * 				method area [공용] , new X, 생성자X, this 각각 X , abstract method{}이 없어서
 *  2. 부모 = 자식 : 한가지 타입(부모)으로 여러객체(자식들)를 관리목적
 *  		    업캐스팅	/ 타입캐스팅 X / 부모에서 메서드호출시 오버라이드가 되서 자식의 메서드 호출
 */


interface Board2 {    void exec();  };
class Board2Insert2 implements Board2{@Override public void exec() { System.out.println("글쓰기");}};
class Board2Select2 implements Board2{@Override public void exec() { System.out.println("글읽기");}};
class Board2Update2 implements Board2{@Override public void exec() { System.out.println("글수정");}};
class Board2Delete2 implements Board2{@Override public void exec() { System.out.println("글삭제");}};

/*
  -----------------------------------------------------------------------------------
  method[공통:static, final, abstract]	Board{exec()} , BoardInsert,,,, InterfaceEx001
  -----------------------------------------------------------------------------------
  heap								stack
  4번지 BoardInsert{@exec()글삭제} ← controller [4번지]	controller.exec();	// 글수정
  3번지 BoardInsert{@exec()글수정} ← controller [3번지]	controller.exec();	// 글수정
  2번지 BoardInsert{@exec()글읽기} ← controller [2번지]	controller.exec();	// 글읽기
  1번지 BoardInsert{@exec()글쓰기} ← controller [1번지]	controller.exec();	// 글쓰기
  							controller [null] 주소못담았어
  						   		|main
 
 */




//class Board2Select extends Board2
//{    void exec();  };
//class Board2Update extends Board2
//{    void exec();  };
//class Board2Delete extends Board2
//{    void exec();  };


//class Insert imprements Board2Insert2() {
//	
//	
//}


public class InterfaceEx001_2 {

	public static void main(String[] args) {
        Board2 controller = null; 
        controller = new Board2Insert2();  controller.exec();
        controller = new Board2Select2();  controller.exec();
        controller = new Board2Update2();  controller.exec();
        controller = new Board2Delete2();  controller.exec();
	}

}
