package com.dennis.designpattern.adapter;

public class LightningToMicroUsbAdapter implements IMicroUsbPhone {
  
  private final ILightningPhone lightningPhone;

  public LightningToMicroUsbAdapter(ILightningPhone lightningPhone) {
    this.lightningPhone = lightningPhone;
  }

  public void useMicroUsb() {
    System.out.println("MicroUsb connected");
    lightningPhone.useLightning();
  }

  public void recharge() {
    lightningPhone.recharge();
  }
}
