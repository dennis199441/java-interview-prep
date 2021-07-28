package com.dennis.designpattern.builder;

public interface ICarBuilder {
  
  public void buildEngine();

  public void buildFrame();

  public Car getResult();
  
}
