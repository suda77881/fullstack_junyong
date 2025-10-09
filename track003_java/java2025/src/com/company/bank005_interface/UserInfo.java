package com.company.bank005_interface;


public class UserInfo {
	
	private String id;
	private String pass;
	private double balance;
	private double dbalance;
	
	public UserInfo(String id, String pass, double balance) { super(); this.id = id; 
	this.pass = pass; this.balance = balance; }
	
	@Override public String toString() { return "UserInfo [Id=" + id + ", Pass=" + pass + ", balance=" + balance + "]"; }
	public String getId() { return id; } public void setId(String id) { this.id = id; } 
	public String getPass() { return pass; } 
	public void setPass(String pass) { this.pass = pass; } public double getBalance() { return balance; } 
	public void setBalance(double balance) { this.balance = balance; }
	public double getDbalance() { return dbalance; }  public void setDbalance(double dbalance) { this.dbalance = dbalance; }
	

}
