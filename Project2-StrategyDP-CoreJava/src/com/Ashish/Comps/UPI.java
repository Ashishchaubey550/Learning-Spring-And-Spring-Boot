package com.Ashish.Comps;

public class UPI implements IPayment {

    public UPI() {
        System.out.println("UPI 0-Param Constructor");
    }

    @Override
    public void payment(){
        System.out.println("Payment is done using UPI");
    }
}
