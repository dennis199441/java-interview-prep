package com.dennis.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class EventChannel implements IObservable {

  private List<IObserver> observers = new ArrayList<IObserver>();
  private int state = 0;

  @Override
  public void add(IObserver observer) {
    this.observers.add(observer);
  }

  @Override
  public void remove(IObserver observer) {
    this.observers.remove(observer);
  }

  @Override
  public void notifyObervers() {
    for (IObserver observer : this.observers) {
      observer.update();
    }
  }

  public int getState() {
    return this.state;
  }

  public void setState(int state) {
    this.state = state;
  }

}
