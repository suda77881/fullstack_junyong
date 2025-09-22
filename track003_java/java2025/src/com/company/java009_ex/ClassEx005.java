package com.company.java009_ex;


class Card{
	   int cardNum; boolean  isMembership;   
	   
	   public Card
	   ()
	   {}
	   
	   void input()
	   {
//		   int cardNum;
//		   boolean isMembership;
		   this.cardNum = cardNum;
		   this.isMembership = isMembership;
	   } 
	   
	   void show(){
		   System.out.println("Card=" + this.cardNum + " isMembership=" + 
	   this.isMembership);
		   
	   }
	   // toString 사용 ####
	   @Override
	   public String toString() {
		return "Card [cardNum=" + cardNum + ", isMembership=" + isMembership + "]";
	   }
	   
	}// end class


public class ClassEx005{
   public static void main(String[] args) {
   Card  c1 = new Card(); 
   System.out.println(c1);  // Card [cardNum=0, isMembership=false]
//   c1.show();
   }
}
	
	


//	출력내용 :
//	Card[cardNum=0, isMembership=false]
