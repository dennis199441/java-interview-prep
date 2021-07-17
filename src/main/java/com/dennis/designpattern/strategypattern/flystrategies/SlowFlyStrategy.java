package com.dennis.designpattern.strategypattern.flystrategies;

public class SlowFlyStrategy implements IFlyStrategy {
  
  public void fly() {
    System.out.println("slow fly!");
  } 
  
}
