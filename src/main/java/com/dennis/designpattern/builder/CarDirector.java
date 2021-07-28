package com.dennis.designpattern.builder;

public class CarDirector {
  
  private Car car;
  
  private ICarBuilder builder;

  public void setBuilder(ICarBuilder builder) {
    this.builder = builder;
  }

  public Car build() {
    System.out.println("Director: Delegating constructing a complex object to a builder object.");
    this.builder.buildEngine();
    this.builder.buildFrame();
    car = this.builder.getResult();
    return car;
  }
}
