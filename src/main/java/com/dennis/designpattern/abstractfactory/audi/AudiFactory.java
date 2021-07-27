package com.dennis.designpattern.abstractfactory.audi;

import com.dennis.designpattern.abstractfactory.ICar;
import com.dennis.designpattern.abstractfactory.IShip;
import com.dennis.designpattern.abstractfactory.ITransportFactory;

public class AudiFactory implements ITransportFactory {

  @Override
  public ICar createCar() {
    return new AudiCar();
  }

  @Override
  public IShip createShip() {
    return new AudiShip();
  }

}
