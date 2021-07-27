package com.dennis.designpattern.abstractfactory;

public interface ITransportFactory {
  
  public ICar createCar();

  public IShip createShip();
  
}
