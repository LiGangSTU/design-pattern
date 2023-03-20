package com.ligang.principles.demo4;

public class HeiMaSafetyDoor implements AntiTheft, Fireproof, Wateproof{

    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireproof() {
        System.out.println("防火");
    }

    @Override
    public void waterproof() {
        System.out.println("防水");
    }
}
