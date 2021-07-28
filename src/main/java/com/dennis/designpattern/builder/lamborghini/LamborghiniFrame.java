package com.dennis.designpattern.builder.lamborghini;

import com.dennis.designpattern.builder.IFrame;

public class LamborghiniFrame implements IFrame {

  private final String colour;

  public LamborghiniFrame(String colour) {
    this.colour = colour;
  }

  @Override
  public String getColour() {
    return this.colour;
  }
  
}
