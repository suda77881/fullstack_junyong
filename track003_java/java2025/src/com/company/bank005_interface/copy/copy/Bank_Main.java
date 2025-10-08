package com.company.bank005_interface.copy.copy;

import java.util.ArrayList;
import java.util.List;

public class Bank_Main {
	
	private List<UserInfo> users[]; 
	public BankController [] controller;
	
	
	public List<UserInfo>[] getUsers() { return users; }   public void setUsers(List<UserInfo>[] users) { this.users = users; }
	public BankController[] getController() { return controller; }   public void setController(BankController[] controller) { this.controller = controller; }

	
	public Bank_Main(List<UserInfo>[] users, BankController[] controller) {
		super();
		this.users = users;
		this.controller = controller;
	}
	
	
	public Bank_main() {
		users 		= new ArrayList<>();
		controller  = new BankController[]{
				new Login(), new Add(), new Show(), 
				new Deposit(), new Withdraw(), new Delete()  };
		
	};
	
	public void menu() {
		
	}
	

	public static void main(String[] args) {
		
		
		
		
		
		
		

	}

}
