package com.dennis.designpattern.builder;

import com.dennis.designpattern.builder.audi.AudiFrame;
import com.dennis.designpattern.builder.audi.AudoEngine;

public class AudiCarBuilder implements ICarBuilder {

  private Car car = new Car();

  @Override
  public void buildEngine() {
    car.setEngine(new AudoEngine());  
  }

  @Override
  public void buildFrame() {
    car.setFrame(new AudiFrame("black"));
  }

  @Override
  public Car getResult() {
    return car;
  }
  
}
