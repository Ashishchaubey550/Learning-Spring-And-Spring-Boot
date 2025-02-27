package com.Ashish.comps;

public final class DTDC implements ICourier{
    public  DTDC(){
        System.out.println("DTDC 0-Param Construction");
    }



    @Override
    public String deliver(int orderId){
        System.out.println("DTDC Deliver");
        return orderId + " order id Order is ready to deliver by DTDC";
    }
}
