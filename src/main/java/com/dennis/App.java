package com.dennis;

import com.dennis.designpattern.strategypattern.Duck;
import com.dennis.designpattern.strategypattern.Eagle;
import com.dennis.designpattern.strategypattern.eatstrategies.BiteEatStrategy;
import com.dennis.designpattern.strategypattern.eatstrategies.SwallowEatStrategy;
import com.dennis.designpattern.strategypattern.flystrategies.FastFlyStrategy;
import com.dennis.designpattern.strategypattern.flystrategies.SlowFlyStrategy;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Duck duck = new Duck(new SlowFlyStrategy(), new BiteEatStrategy());
        Eagle eagle = new Eagle(new FastFlyStrategy(), new SwallowEatStrategy());
        duck.fly();
        duck.eat();
        eagle.fly();
        eagle.eat();
    }

}
