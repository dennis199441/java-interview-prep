package com.dennis.designpattern.builder;

import com.dennis.designpattern.builder.lamborghini.LamborghiniEngine;
import com.dennis.designpattern.builder.lamborghini.LamborghiniFrame;

public class LamborghiniCarBuilder implements ICarBuilder {

  private Car car = new Car();

  @Override
  public void buildEngine() {
    car.setEngine(new LamborghiniEngine());  
  }

  @Override
  public void buildFrame() {
    car.setFrame(new LamborghiniFrame("yellow"));
  }

  @Override
  public Car getResult() {
    return car;
  }
  
}
