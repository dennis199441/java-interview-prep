package com.dennis.designpattern.builder.lamborghini;

import com.dennis.designpattern.builder.IEngine;

public class LamborghiniEngine implements IEngine {

  @Override
  public void startEngine() {
    System.out.println("Start Lamborghini Engine");
  }

}
