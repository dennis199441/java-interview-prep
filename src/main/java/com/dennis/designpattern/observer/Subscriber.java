package com.dennis.designpattern.observer;

public class Subscriber implements IObserver {

  private EventChannel observable;

  public Subscriber(EventChannel observable) {
    this.observable = observable;
  }

  public void update() {
    System.out.format("%s getState %d\n", this.toString(), this.observable.getState());
  }
}
