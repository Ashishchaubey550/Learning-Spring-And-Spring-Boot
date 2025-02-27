package com.Ashish.main;

import com.Ashish.Comps.Payment;
import com.Ashish.factory.PaymentFactory;

public class Main {
    public static void main(String [] args){
        Payment pay = PaymentFactory.getInstance("PayPal");
        pay.makePayment();
    }
}
