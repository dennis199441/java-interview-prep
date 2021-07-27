package com.dennis.designpattern.adapter;

public class RechargeService {

    public static void rechargeMicroUsbPhone(IMicroUsbPhone phone) {
      phone.useMicroUsb();
      phone.recharge();
    }

    public static void rechargeLightningPhone(ILightningPhone phone) {
      phone.useLightning();
      phone.recharge();
    }
}
