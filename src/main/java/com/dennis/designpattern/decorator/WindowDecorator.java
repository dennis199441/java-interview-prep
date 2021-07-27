package com.dennis.designpattern.decorator;

public abstract class WindowDecorator implements IWindow {

  private final IWindow window;

  public WindowDecorator(IWindow window) {
    this.window = window;
  }

  @Override
  public void draw() {
    this.window.draw();
  }

  @Override
  public String getDescription() {
    return this.window.getDescription();
  }
  
}
