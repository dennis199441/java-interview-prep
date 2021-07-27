package com.dennis.designpattern.decorator;

public class HorizontalScrollWindow extends WindowDecorator {

  public HorizontalScrollWindow(IWindow window) {
    super(window);
  }
  
  @Override
  public void draw() {
    super.draw();
    drawHorizontalScrollBar();
  }

  @Override
  public String getDescription() {
    return super.getDescription() + " and horizontal scrollbar";
  }

  private void drawHorizontalScrollBar() {
    System.out.println("drawHorizontalScrollBar");
  }
}
