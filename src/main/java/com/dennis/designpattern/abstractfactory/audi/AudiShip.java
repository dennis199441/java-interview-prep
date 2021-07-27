package com.dennis.designpattern.abstractfactory.audi;

import com.dennis.designpattern.abstractfactory.IShip;

public class AudiShip implements IShip {

  @Override
  public void startShipEngine() {
    System.out.println("Start AudiShip engine");
  }
  
}
