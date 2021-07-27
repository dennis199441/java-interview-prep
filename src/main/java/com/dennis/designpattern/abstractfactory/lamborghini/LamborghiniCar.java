package com.dennis.designpattern.abstractfactory.lamborghini;

import com.dennis.designpattern.abstractfactory.ICar;

public class LamborghiniCar implements ICar {

  @Override
  public void startCarEngine() {
    System.out.println("Starting LamborghiniCar engine");
  }
  
}
