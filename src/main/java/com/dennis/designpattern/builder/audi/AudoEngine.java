package com.dennis.designpattern.builder.audi;

import com.dennis.designpattern.builder.IEngine;

public class AudoEngine implements IEngine {

  @Override
  public void startEngine() {
    System.out.println("Start Audi Engine");
  }
  
}
