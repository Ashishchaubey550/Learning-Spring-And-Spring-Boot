package com.Ashish.comps;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
    private ICourier courier; // HAS-A property ,, Here we used Composition Not Extend because we only want to use some property from implemets class not all if we want to use all property then we use Extend

    public void setCourier(ICourier courier) {
        System.out.println("Flipkart.setCourier");
        this.courier = courier;
    }

    // Bussiness Property

    public String Shopping(String items[], Double price[]) {
        // Calculate Bill Amount
        double billAmount = 0.0;
        for (double p : price) {
            billAmount = billAmount + p;

        }
        // Order Id
        int orderId = new Random().nextInt(1000);
        // deliver items
        String msg = courier.deliver(orderId);
        return Arrays.toString(items) + "are purchased having prices " + Arrays.toString(price) + "Having Prices" + "Bill Amount " + billAmount + msg   ;
    }
}
