package com.dennis.designpattern.decorator;

public class BaseWindow implements IWindow {
  
  public void draw() {}

  public String getDescription() {
    return "Base window";
  }
}
