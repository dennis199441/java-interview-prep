package com.dennis.designpattern.adapter;

public class Iphone implements ILightningPhone {
  
  private boolean connector;

  public void useLightning() {
    this.connector = true;
    System.out.println("Lightning connected");
  }

  public void recharge() {
    if(connector) {
      System.out.println("Recharge started");
      System.out.println("Recharge finished");
      return;
    }
    System.out.println("Connect Lightning first");
  }
}
