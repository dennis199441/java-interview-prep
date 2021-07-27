package com.dennis.designpattern.decorator;

public class VerticalScrollWindow extends WindowDecorator {

  public VerticalScrollWindow(IWindow window) {
    super(window);
  }

  @Override
  public void draw() {
    super.draw();
    drawVerticalScrollBar();
  }

  @Override
  public String getDescription() {
    return super.getDescription() + " and vertical scrollbar";
  }

  private void drawVerticalScrollBar() {
    System.out.println("drawVerticalScrollBar");
  }

}
