package com.dennis.designpattern.adapter;

public class Android implements IMicroUsbPhone {

  private boolean connector;

  public void useMicroUsb() {
    this.connector = true;
    System.out.println("MicroUsb connected");
  }

  public void recharge() {
    if (connector) {
      System.out.println("Recharge started");
      System.out.println("Recharge finished");
      return;
    }
    System.out.println("Connect MicroUsb first");
  }
}
