package com.ligang.adapter.objAdapter;

public class Computer {
    public String readSD(SDCard sdCard){
        if(sdCard == null){
            throw new NullPointerException("sd card null");
        }

        return sdCard.readSD();
    }
}
