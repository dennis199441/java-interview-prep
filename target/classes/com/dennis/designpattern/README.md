# Design Pattern

## Strategy Pattern
A pattern that enables selecting the algorithm at runtime. 

### Motivation
Subclasses might have different behaviours. This might cause code duplications. Instead of implementing the algorithm directly in the class, we separate out the algorithms and use the interface to access the algorithms.

In our example, both duck and eagle are the subclass of bird and have the fly and eat behaviours. However, how duck fly/eat is different from how eagle fly/eat. Since their behaviours are different, we can't implement the fly/eat algorithm directly in the bird class. If we implement the fly/eat algorithm directly in the the duck/eagle class, the code will be duplicated if there is new type of bird which has the same fly behaviour as duck and same eat behaviour as eagle. 

### Example
Check out `com.dennis.designpattern.strategy`. `eatstrategies` defines the algorithms for different eat behaviours while `flystrategies` defines the algorithms for different fly behaviours. `Bird.java` is the base class and each `Bird` should be a fly behaviour and an eat behaviour. The following code snippet shows how to run the example.

```java
Duck duck = new Duck(new SlowFlyStrategy(), new BiteEatStrategy());
Eagle eagle = new Eagle(new FastFlyStrategy(), new SwallowEatStrategy());
duck.fly();
duck.eat();
eagle.fly();
eagle.eat();
```

---

## Observer pattern
An Observable maintains a list of its observers, and notifies them automatically of any state changes by invoking the `observer.update()` method.

### Motivation
Defining a one-to-many dependency between objects by defining one object (observable) that updates the state of dependent objects directly is inflexible because it couples the observable to particular dependent objects.

Observer pattern solves the following problems:
1. A one-to-many dependency between objects should be defined without making the objects tightly coupled.

2. It should be ensured that when one object changes state, an open-ended number of dependent objects are updated automatically.

3. It should be possible that one object can notify an open-ended number of other objects.

### Example
Check out `com.dennis.designpattern.observer`. An Oberservable should have three methods, `add(observer)`, `remove(observer)`, and `notifyObservers()`. An Observer should be the `update()` method. `EventChannel` is the concrete observable and `Subscriber` is the concrete observer. The following code snippet shows how to run the example.

```java
EventChannel channel = new EventChannel();

Subscriber subscriber1 = new Subscriber(channel);
channel.add(subscriber1);

Subscriber subscriber2 = new Subscriber(channel);
channel.add(subscriber2);

Subscriber subscriber3 = new Subscriber(channel);
channel.add(subscriber3);

for (int i = 1; i <= 10; i++) {
    channel.setState(i);
    channel.notifyObervers();
}

channel.remove(subscriber2);

for (int i = 1; i <= 10; i++) {
    channel.setState(i);
    channel.notifyObervers();
}
```