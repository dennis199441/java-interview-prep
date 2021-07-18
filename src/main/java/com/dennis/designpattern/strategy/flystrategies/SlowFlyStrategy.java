package com.dennis.designpattern.strategy.flystrategies;

public class SlowFlyStrategy implements IFlyStrategy {
  
  public void fly() {
    System.out.println("slow fly!");
  } 

}
