package com.ligang.adapter.classAdapter;

public class Computer {
    public String readSD(SDCard sdCard){
        if(sdCard == null){
            throw new NullPointerException("sd card null");
        }

        return sdCard.readSD();
    }
}
