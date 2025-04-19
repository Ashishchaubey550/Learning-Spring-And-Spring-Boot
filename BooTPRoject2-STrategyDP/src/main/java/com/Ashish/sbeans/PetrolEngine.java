package com.Ashish.sbeans;


import org.springframework.stereotype.Component;

@Component("pEngine")
public class PetrolEngine implements IEngine {
    @Override
    public void startEngine() {
        System.out.println("PetrolEngine::StartEngine()");
    }

    @Override
    public void StopEngine() {
        System.out.println("PetrolEngine::StopEngine");
    }
}
