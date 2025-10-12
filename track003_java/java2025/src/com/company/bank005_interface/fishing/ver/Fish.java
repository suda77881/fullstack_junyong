package com.company.bank005_interface.fishing.ver;

public class Fish {
 private String name;
 private int minSize;
 private int basePrice;
 private double catchRate;
 
 public Fish(String name, int minSize, int basePrice, double catchRate) { this.name = name; this.minSize = minSize; 
 this.basePrice = basePrice; this.catchRate = catchRate; }

 public String getName() { return name; }  public void setName(String name) { this.name = name; }  public int getMinSize() { return minSize; }  public void setMinSize(int minSize) { this.minSize = minSize; }  public int getBasePrice() { return basePrice; }  public void setBasePrice(int basePrice) { this.basePrice = basePrice; }  public double getCatchRate() { return catchRate; }  public void setCatchRate(double catchRate) { this.catchRate = catchRate; }

 @Override public String toString() { return name + " (" + minSize + "mm, ₩" + basePrice + ")"; }
 
}
