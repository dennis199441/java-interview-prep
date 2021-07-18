package com.dennis.designpattern.strategy;

import com.dennis.designpattern.strategy.eatstrategies.IEatStrategy;
import com.dennis.designpattern.strategy.flystrategies.IFlyStrategy;

public abstract class Bird {
  
  protected IFlyStrategy flyStrategy;
  protected IEatStrategy eatStrategy;

  public void fly() {
    this.flyStrategy.fly();
  }

  public void eat() {
    this.eatStrategy.eat();
  }
}
