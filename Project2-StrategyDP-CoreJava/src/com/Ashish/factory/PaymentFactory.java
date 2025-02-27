package com.Ashish.factory;

import com.Ashish.Comps.*;

public class PaymentFactory {
    public static Payment getInstance(String paytype){
        IPayment payment = null;
        if (paytype.equalsIgnoreCase("upi"))
            payment = new UPI();
        else if (paytype.equalsIgnoreCase("Paypal"))
            payment = new PayPal();
        else if (paytype.equalsIgnoreCase("Credit"))
            payment = new CreditCard();
        else
            throw new IllegalArgumentException("Invalid payment type");
        return new Payment(payment);
    }
}
