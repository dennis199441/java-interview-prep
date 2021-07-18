package com.dennis.designpattern.observer;

public interface IObservable {
   
  public void add(IObserver observer);
  public void remove(IObserver observer);
  public void notifyObervers();
    
}
