package com.Ashish.sbeans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vichel")
public class Vichel {

    @Autowired
    @Qualifier("cngEngine")
    private IEngine engine;

    public void journey(String startPlace , String endPlace){
        engine.startEngine();
        System.out.println("Journey Start At::" + startPlace);
        System.out.println("Journey is going on....");
        System.out.println("Journey Reached to Destination");
        engine.StopEngine();
    }
}
