package com.Ashish.sbeans;

import org.springframework.stereotype.Component;

@Component("cngEngine")
public class CNGEngine implements IEngine{
    @Override
    public void startEngine() {
        System.out.println("CNGEngine::StartEngine");
    }

    @Override
    public void StopEngine() {
        System.out.println("CNGEngine::StopEngine");
    }
}
