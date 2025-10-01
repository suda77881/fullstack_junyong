package com.company.java013_ex;


interface Board {    void exec();  };


//BoardInsert: 글쓰기 기능
//BoardSelect: 글읽기 기능
//BoardUpdate: 글수정 기능
//BoardDelete: 글삭제 기능

class BoardInsert implements Board
{
	@Override public void exec() { 
		System.out.println("글쓰기");
	}  
};
	
class BoardSelect implements Board
{
	@Override public void exec() { 
		System.out.println("글읽기");
	}      
};
class BoardUpdate implements Board
{
	@Override public void exec() {  
		System.out.println("글수정");
	}      
};
		
class BoardDelete implements Board
{
	@Override public void exec() { 
		System.out.println("글삭제");
	}      
};
//class BoardSelect extends Board
//{    void exec();  };
//class BoardUpdate extends Board
//{    void exec();  };
//class BoardDelete extends Board
//{    void exec();  };


//class Insert imprements BoardInsert() {
//	
//	
//}


public class InterfaceEx001 {

	public static void main(String[] args) {
        Board controller = null; 
        controller = new BoardInsert();  controller.exec();
        controller = new BoardSelect();  controller.exec();
        controller = new BoardUpdate();  controller.exec();
        controller = new BoardDelete();  controller.exec();
	}

}
