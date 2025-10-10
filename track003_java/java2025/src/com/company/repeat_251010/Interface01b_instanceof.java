package com.company.repeat_251010;


//Q8. abstract vs interface의 공통점과 차이점
/*	둘다 설계가 가능한 클래스
 	공통점 : 자식객체를 통해서 코드를 구현
  	차이점 : 추상화 정도가 interface가 더 크다.
  	abstract - 인스턴스변수, 인스턴스메서드 사용가능
  	interface - 상수(public static final)	, abstract 메서드
 */
//Q9.  interface - can do this
/*		
Driver.....>   	Vehicle	{run()} 	
	 		....△        ....△
	 	  MotorCycle	 Car
	 	  { helmet() , @run() } {@run()}
	 */


interface Vehicle1b {public void run();}

class MotorCycle1b implements Vehicle1b{

	@Override public void run() { 

		System.out.println("오토바이가 달립니다.");  }
	public void helmet() {
		System.out.println("헬멧을 착용합니다.");
	}
	
}

class Car1b implements Vehicle1b{

	@Override
	public void run() {
		System.out.println("자동차가 달립니다.");		
	}
	
}

class Driver1b{


	public Driver1b() { super();  }
	
	public void drive(Vehicle1b veh) {	// 의존관계 갈아끼우기, 잠시쓰고버림
		// 자동차일때 자동차가 달린다, // 오토바이 헬멧, 달린다.
		if(veh instanceof MotorCycle1b) {((MotorCycle1b)veh).helmet();}
		veh.run();
		

	}
	
}

public class Interface01b_instanceof {

	public static void main(String[] args) {
		
		Driver1b driver1b = new Driver1b();
		
		MotorCycle1b MotorCycle1b = new MotorCycle1b();
		Car1b Car1b = new Car1b();
		
		driver1b.drive(Car1b);
		
		System.out.println("\n\n>> 자동차가 고장나서 교통수단을 바꿉니다!");
		
		driver1b.drive(MotorCycle1b);

	}

}
