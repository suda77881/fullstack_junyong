package com.company.java013_ex;


interface Vehicle {
	   public void run();
	} 
class MotorCycle implements Vehicle {
   @Override
   public void run() {
      System.out.println("오토바이가 달립니다.");
   }
}
class Car implements Vehicle {
   @Override
   public void run() {
      System.out.println("자동차가 달립니다.");
   }
}

class Driver{
	
	
	void drive(Vehicle veh) {veh.run();};		// 객체생성을 건너뛰고 파리미터에서 클래스를 참조변수에 담아서 메서드실행에 활용
}



	public class InterfaceEx002 {
		   public static void main(String[] args) {
		      Driver driver = new Driver();
		      
		      Car car = new Car();
		      MotorCycle mo = new MotorCycle();
		      // return void drive (Vehicle veh) {}
		      driver.drive(car);
		      driver.drive(mo);
		   }
		}
