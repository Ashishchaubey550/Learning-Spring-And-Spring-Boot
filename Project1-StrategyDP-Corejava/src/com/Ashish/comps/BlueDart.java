package com.Ashish.comps;

public final class BlueDart implements ICourier{
    public BlueDart(){
        System.out.println("BlueDart 0-Param Constructor");
    }

    @Override
    public String deliver(int orderId){
        System.out.println("BlueDart Delivery");
        return orderId+"order ID Order is ready to deliver by Blue Dart";
    }
}
