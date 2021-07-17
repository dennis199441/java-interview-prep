package com.dennis.designpattern.strategypattern.flystrategies;

public class FastFlyStrategy implements IFlyStrategy {
  
  public void fly() {
    System.out.println("Fast fly");
  }
  
}
