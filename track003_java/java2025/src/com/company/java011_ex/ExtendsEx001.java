package com.company.java011_ex;


/*
Color 클래스 : 멤버 변수:  name (String, public)  / num (int, private)			■ 4.
   ↑
Green 클래스  : 멤버 변수:  name (String, public), num (int, private)			■ 5.
   ↑																
Green 클래스 : void show(){}      ■ Green(){				show()}				■ 6.
								■ 1번지)

■ 3. Object(){				}			 } ■ 4.
■ 2. Color(){ name=null}				 } ■ 5.
■ 1. Green(){					show()   } ■ 6.
■ 0. 1번지)							 
------------------------------------
Green mygreen = new Green();
------------------------------------

1. Green은 Color 이다, Green은 Object이다.
2. 
 */


class Color {
	
	 public String name; 
	 private int num;
	 public int getNum() { return num; } public void setNum(int num) { this.num = num; }
	 @Override public String toString() { return "Green [name=" + name + ", getNum()=" + getNum() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}
}


class Green extends Color {
	


	void show () {System.out.println(this.name); 
	System.out.println("GREEN");
	System.out.println("NAME: " + this.name);
	System.out.println("NAME: " + this.getNum());	//	private

	}
	
	/// 디폴드 생성자 이름을 확인해서 get, set을 진행해야하는듯.
	
	
}

//4. 클래스 구조 설명
//Color 클래스 : 멤버 변수:  name (String, public)  / num (int, private)
// ↑
//Green 클래스  : 멤버 변수:  name (String, public), num (int, private)


public class ExtendsEx001 {
    public static void main(String[] args){
        Green mygreen = new Green();
        mygreen.name = "LIGHT_GREEN";
        mygreen.setNum(5);
        mygreen.show();
    }

}

