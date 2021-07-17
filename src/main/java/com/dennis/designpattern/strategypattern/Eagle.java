package com.dennis.designpattern.strategypattern;

import com.dennis.designpattern.strategypattern.eatstrategies.IEatStrategy;
import com.dennis.designpattern.strategypattern.flystrategies.IFlyStrategy;

public class Eagle extends Bird {

  public Eagle(IFlyStrategy flyStrategy, IEatStrategy eatStrategy) {
    this.flyStrategy = flyStrategy;
    this.eatStrategy = eatStrategy;
  }

}
