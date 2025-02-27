package com.Ashish.Comps;

public class CreditCard implements IPayment{

    public CreditCard() {
        System.out.println("CrediCard 0-Param Constructor");
    }

    @Override
    public void payment(){
        System.out.println("Payment is Done Use CreditCard ");
    }
}
