package com.company.java011_ex;
// public(어디서든지) > protected(상속-extends) > package(default 같은폴더) > private(클래스내)
public class Milk { // java011_ex에 설정해주세요!
	private    int mno;
	private String mname;
	private    int mprice;

	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public int getMprice() {
		return mprice;
	}

	public void setMprice(int mprice) {
		this.mprice = mprice;
	}

	@Override
	public String toString() {
		return "Milk [mno=" + mno + ", mname=" + mname + ", mprice=" + mprice + "]";
	}

}
