package com.dennis.designpattern.strategy;

import com.dennis.designpattern.strategy.eatstrategies.IEatStrategy;
import com.dennis.designpattern.strategy.flystrategies.IFlyStrategy;

public class Duck extends Bird {
  
  public Duck(IFlyStrategy flyStrategy, IEatStrategy eatStrategy) {
    this.flyStrategy = flyStrategy;
    this.eatStrategy = eatStrategy;
  }
  
}
