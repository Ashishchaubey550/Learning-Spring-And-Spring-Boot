package com.Ashish.main;

import com.Ashish.comps.Flipkart;
import com.Ashish.factory.FlipkartFactory;

public class Main {
    public static void main(String[] args) {
        Flipkart fpkt = FlipkartFactory.getInstance("bluedart");
        String msg = fpkt.Shopping(new String[]{"Shirt", "trouser", "kite"}, new Double[]{
                3000.0, 2000.0, 500.0});
        System.out.println(msg);
    }
}

