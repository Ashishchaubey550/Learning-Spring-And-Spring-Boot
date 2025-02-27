package com.Ashish.Comps;

public class PayPal implements IPayment{
    public PayPal() {
        System.out.println("PayPal 0-Param Constructor");
    }

    @Override

    public void payment(){
        System.out.println("Payment is Done Using PayPal");
    }
}
