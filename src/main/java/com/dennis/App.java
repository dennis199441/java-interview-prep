package com.dennis;

import com.dennis.designpattern.abstractfactory.Client;
import com.dennis.designpattern.abstractfactory.audi.AudiFactory;
import com.dennis.designpattern.abstractfactory.lamborghini.LamborghiniFactory;
import com.dennis.designpattern.adapter.Android;
import com.dennis.designpattern.adapter.Iphone;
import com.dennis.designpattern.adapter.LightningToMicroUsbAdapter;
import com.dennis.designpattern.adapter.RechargeService;
import com.dennis.designpattern.decorator.BaseWindow;
import com.dennis.designpattern.decorator.HorizontalScrollWindow;
import com.dennis.designpattern.decorator.IWindow;
import com.dennis.designpattern.decorator.VerticalScrollWindow;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Adapter Pattern
        Iphone iphone = new Iphone();
        Android android = new Android();        
        RechargeService.rechargeLightningPhone(iphone);
        RechargeService.rechargeMicroUsbPhone(android);
        RechargeService.rechargeMicroUsbPhone(new LightningToMicroUsbAdapter(iphone));

        // Decorator Pattern
        IWindow window = new HorizontalScrollWindow(new VerticalScrollWindow(new BaseWindow()));
        System.out.println(window.getDescription());


        // Abstract Factory Pattern
        Client audiClient = new Client(new AudiFactory());
        Client lamborghiniClient = new Client(new LamborghiniFactory());
        audiClient.operation();
        lamborghiniClient.operation();
    }

}
