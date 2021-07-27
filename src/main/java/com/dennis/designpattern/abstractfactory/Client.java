package com.dennis.designpattern.abstractfactory;

public class Client {
  
  private ICar car;
  private IShip ship;
  private ITransportFactory factory;

  public Client(ITransportFactory factory) {
    this.factory = factory;
  }

  public void operation() {
    car = this.factory.createCar();
    ship = this.factory.createShip();
    car.startCarEngine();
    ship.startShipEngine();
  }
  
}
