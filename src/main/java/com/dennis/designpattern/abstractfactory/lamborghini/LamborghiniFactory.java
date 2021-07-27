package com.dennis.designpattern.abstractfactory.lamborghini;

import com.dennis.designpattern.abstractfactory.ICar;
import com.dennis.designpattern.abstractfactory.IShip;
import com.dennis.designpattern.abstractfactory.ITransportFactory;

public class LamborghiniFactory implements ITransportFactory {

  @Override
  public ICar createCar() {
    return new LamborghiniCar();
  }

  @Override
  public IShip createShip() {
    return new LamborghiniShip();
  }
  
}
