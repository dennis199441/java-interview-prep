package com.dennis.designpattern.builder;

public class Car {

  private IFrame frame;
  
  private IEngine engine;

  public IFrame getFrame() {
    return this.frame;
  }

  public void setFrame(IFrame frame) {
    this.frame = frame;
  }

  public IEngine getEngine() {
    return this.engine;
  }

  public void setEngine(IEngine engine) {
    this.engine = engine;
  }

}
