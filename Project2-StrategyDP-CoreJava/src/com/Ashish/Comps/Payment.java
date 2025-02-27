package com.Ashish.Comps;

public class Payment {
    private IPayment payment;

    public Payment(IPayment payment) {
        this.payment = payment;
    }
    public void makePayment() {
        payment.payment();  // Call the method from IPayment
    }
}
