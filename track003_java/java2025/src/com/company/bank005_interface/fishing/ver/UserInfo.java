package com.company.bank005_interface.fishing.ver;
public class UserInfo {
	
	private String id;
	private String pass;
	private double balance;
//	private double dbalance;
	public  int find;
	private Rod rod;	//	낚시대
	
	private int blowfishCount;
	private int carpCount;
	private int shrimpCount;
	private int sharkCount;
	private int whaleCount;

	
	public UserInfo(String id, String pass, double balance, Rod rod) { super(); this.id = id; 
	this.pass = pass; this.balance = balance; this.rod = rod;}
	
	public Rod getRod() { return rod; }  public void setRod(Rod rod) { this.rod = rod; }

	@Override public String toString() { return "UserInfo [Id=" + id + ", Pass=" + pass + ", balance=" + balance + "]"; }
	public String getId() { return id; } public void setId(String id) { this.id = id; } 
	public String getPass() { return pass; } 
	public void setPass(String pass) { this.pass = pass; } 
	public double getBalance() { return balance; } 
	public void setBalance(double balance) { this.balance = balance; }
//	public double getDbalance() { return dbalance; }  public void setDbalance(double dbalance) { this.dbalance = dbalance; }

	public int getBlowfishCount() { return blowfishCount; }  
	public void setBlowfishCount(int blowfishCount) { this.blowfishCount = blowfishCount; }  public int getCarpCount() { return carpCount; }  
	public void setCarpCount(int carpCount) { this.carpCount = carpCount; }  
	public int getShrimpCount() { return shrimpCount; }  
	public void setShrimpCount(int shrimpCount) { this.shrimpCount = shrimpCount; }  
	public int getSharkCount() { return sharkCount; }  
	public void setSharkCount(int sharkCount) { this.sharkCount = sharkCount; }  
	public int getWhaleCount() { return whaleCount; }  
	public void setWhaleCount(int whaleCount) { this.whaleCount = whaleCount; } 
	
	public void addBlowfish() { blowfishCount++; }
	public void addCarp() { carpCount++; }
	public void addShrimp() { shrimpCount++; }
	public void addShark() { sharkCount++; }
	public void addWhale() { whaleCount++; }

	public void decreaseBalance(double amount) { balance -= amount; }


}
