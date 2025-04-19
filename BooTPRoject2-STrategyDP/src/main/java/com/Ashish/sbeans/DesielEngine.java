package com.Ashish.sbeans;


import org.springframework.stereotype.Component;

@Component("dEngine")
public class DesielEngine implements IEngine{
    @Override
    public void startEngine() {
        System.out.println("DesielEngine::StartEngine");
    }

    @Override
    public void StopEngine() {
        System.out.println("DesielEngine::StopEngine");
    }
}
