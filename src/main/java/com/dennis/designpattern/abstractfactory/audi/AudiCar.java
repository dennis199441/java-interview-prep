package com.dennis.designpattern.abstractfactory.audi;

import com.dennis.designpattern.abstractfactory.ICar;

public class AudiCar implements ICar {

  @Override
  public void startCarEngine() {
    System.out.println("Starting AudiCar engine");
  }
  
}
