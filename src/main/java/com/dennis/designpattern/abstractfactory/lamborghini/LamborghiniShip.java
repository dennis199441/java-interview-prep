package com.dennis.designpattern.abstractfactory.lamborghini;

import com.dennis.designpattern.abstractfactory.IShip;

public class LamborghiniShip implements IShip {

  @Override
  public void startShipEngine() {
    System.out.println("Start LamborghiniShip engine");
  }
  
}
