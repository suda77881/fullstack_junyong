package com.company.java011_ex;

/* Object							Object
 *   ↑								  ↑	
 * Grand { one() , two()	}	  Uncle, Aunt
 *   ↑
 * Father {three()}
 * 
 * 
 */



class Grand extends Object {
    public void one() { System.out.println("grand : one"); }
    public void two() { System.out.println("grand : two"); }

}
// (1) Father 클래스가 Grand 클래스를 상속받도록 수정
class Father extends Grand {

    public void three() { System.out.println("Father : three"); } 
	
}

class Uncle extends Grand {
	
	public void four() {System.out.println("Uncle : four");}
	@Override  public void one() {System.out.println("Uncle : one");}
	@Override  public void two() {System.out.println("Uncle : two");}
}
class Aunt{
	String name="mimi";

	@Override public String toString() { return super.toString(); }
	
	
}

public class ClassEx003 {
	public static void main(String[] args) {
		
		Father papa = new Father() ; papa.one(); papa.two(); papa.three();
		Uncle uncle = new Uncle(); uncle.four(); uncle.one(); uncle.two();
		
		// Q1. Uncle이 쓸 수 있는 메서드는? Uncle{one() , two() , four() } → Grand{ one() , two() }
		// Q2. 24번째줄에서 출력되는 내용은? Uncle{@one() , @two() , four() } → Grand{ one() , two() }
		// Q3. 18,19번째의 개념은? @Override  상속시 부모와 같은 메서드를 자식클래스에 맞게 수정한것!

	}
}
