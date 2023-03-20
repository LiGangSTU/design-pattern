package com.ligang.principles.demo4;

public class ItCastSafteyDoor implements AntiTheft, Fireproof{
    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireproof() {
        System.out.println("防火");
    }
}
