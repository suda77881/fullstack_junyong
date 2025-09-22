package com.company.java009_ex;

class Score{
	   String stdid; int kor,eng,math,total; double avg;   
	   
	   Score (String stdid, int kor,int eng,int math){
		   
		   this.stdid = stdid;
		   this.kor = kor;
		   this.eng = eng;
		   this.math = math;
		   }
	   
	   int total() {
		  return (this.kor + this.eng + this.math);
	   	}
	   double avg()  {	// ()안에 빼고
		   avg = (this.kor + this.eng + this.math) / 3.0;
		   return avg;}
	   
	   void info() {

//		   this.total = total;
//		   this.avg = avg;

		   System.out.printf("%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\n",
				   			"학번","KOR","ENG","MATH","TOTAL","AVG");
		   System.out.println();
		   System.out.printf("%-5s\t%-5d\t%-5d\t%-5d\t%-5d\t%.2f\n",
				   stdid,this.kor,this.eng,this.math,total(),avg());	// this 붙이고
	   }
	   //※힌트2)  info(){    total();  avg();     }  다른메서드에서 메서드 사용가능  

	   public Score() {super();}
	   
	}
	public class ClassEx006{
	   public static void main(String[] args) {
	   Score  s1= new Score("std1234" , 100, 100 , 99 ); 
	   s1.info();
	   }
	}

//	출력내용 :
//	학번   kor   eng   math   total   avg
//	std1234   100   100   99   299   99.67}


