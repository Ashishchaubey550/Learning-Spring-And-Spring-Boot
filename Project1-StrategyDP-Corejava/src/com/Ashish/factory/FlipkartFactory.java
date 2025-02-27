package com.Ashish.factory;


import com.Ashish.comps.BlueDart;
import com.Ashish.comps.DTDC;
import com.Ashish.comps.Flipkart;
import com.Ashish.comps.ICourier;

public class FlipkartFactory {
    public static Flipkart getInstance (String courierType){
        ICourier courier = null;
        if (courierType.equalsIgnoreCase("dtdc"))
            courier = new DTDC();
        else if (courierType.equalsIgnoreCase("bluedart"))
            courier = new BlueDart();
        else
            throw  new IllegalArgumentException("Invalid Courier");

        // create target class object
        Flipkart fpkt = new Flipkart();
        // Assing depenedent object to target class object

        fpkt.setCourier(courier);
        return fpkt;
    }
}
