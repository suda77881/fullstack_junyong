package com.company.java011_ex;

/* 클래스의 재사용
Object      {         }
  ↑
MobileNote   { show() }
  ↑
MobileNote7   { iris,face / newShow() } 
  ↑
MobileNote8   { ◎face     / ◎newShow() }  
  ↑
MobileNote9   { battery   / ◎newShow() } 

----------------------------------------------
MobileNote8 my8 = new MobileNote8();
----------------------------------------------

----------------------------------------------
MobileNote7 my7 = new MobileNote7();
----------------------------------------------
1.     MobileNote7  는    MobileNote 이다.
2.     생성자호출순서 :  MobileNote9()  → MobileNote8()  → MobileNote7()  → MobileNote()  → Object()
3.     객체생성순서  :  Object → MobileNote → MobileNote7 → MobileNote8 
    1번지 : { iris,face / newShow() } - { show() }
    2번지 { ◎face / ◎newShow()} → { iris,face / newShow() } → { show()} 
    
    오버라이딩 : 상속시 부모와 같은 메서드를 자식에게 맞게 수정
*/

class MobileNote extends Object {
	
	

	void show() {
		

	}

	
}
class MobileNote7 extends MobileNote {
	private String iris;
	private String face;
	
	public String getIris() { return iris; }  public void setIris(String iris) { this.iris = iris; }  public String getFace() { return face; }  public void setFace(String face) { this.face = face; }

	public MobileNote7() { super();  }

	void newShow () {  System.out.println("NOTE7 객체 기능(Overriding)");
		System.out.println("iris = " + this.iris);
		System.out.println("face = " + this.face);
		System.out.println(); }

}

class MobileNote8 extends MobileNote7 {
	private String face;
	public MobileNote8() { super();}
	public String getFace() { return face; }  public void setFace(String face) { this.face = face; }
	
	void newShow () {  System.out.println("NOTE8 객체 기능(Overriding)");
	System.out.println("face = " + this.face);
	System.out.println(); }
//	@Override
//	public String getIris() {
//		return super.getIris();
//	}
//	@Override
//	public void setIris(String iris) {
//		super.setIris(iris);
//	}
}

class MobileNote9 extends MobileNote8 {
	
	private int battery ;
	
	public int getBattery() { return battery; } 
	public void setBattery(int battery) { this.battery = battery; }

	
	@Override void newShow() {  
		super.newShow();
		System.out.println("NOTE9 객체 기능(Overriding)");
		System.out.println("battery = " + this.battery);
		}
	}
	
	
//	void newShow() {  System.out.println("NOTE8 객체 기능(Overriding)");
//	System.out.println("battery = " + this.battery);
//	System.out.println(); }
	
	
	



public class ClassEx002 {
    public static void main(String[] args) {
//        MobileNote7 my7 = new MobileNote7();
//        my7.setIris("brown");
//        my7.setFace("pretty");
//        my7.newShow();
//        
//
//        MobileNote8 my8 = new MobileNote8();
//        my8.setFace("pretty");
//        my8.newShow();
//
//        MobileNote9 my9 = new MobileNote9();
//        my9.setBattery(24);
//        my9.newShow();
    	
	      MobileNote9 my92 = new MobileNote9();
	      my92.setIris("black");
	      my92.setFace("cuty");
	      my92.setBattery(24);
	      my92.newShow();
    }
}
