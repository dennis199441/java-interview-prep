package com.dennis.designpattern.strategypattern;

import com.dennis.designpattern.strategypattern.eatstrategies.IEatStrategy;
import com.dennis.designpattern.strategypattern.flystrategies.IFlyStrategy;

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
