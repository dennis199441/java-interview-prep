package com.dennis.designpattern.builder.audi;

import com.dennis.designpattern.builder.IFrame;

public class AudiFrame implements IFrame {

  private final String colour;

  public AudiFrame(String colour) {
    this.colour = colour;
  }

  @Override
  public String getColour() {
    return this.colour;
  }
  
}
