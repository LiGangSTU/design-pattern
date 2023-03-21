package com.ligang.adapter.objAdapter;

public class test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        SDCard sdCard = new SDCardImpl();
        System.out.println(computer.readSD(sdCard));

        TFCard tfCard = new TFCardImpl();
        System.out.println("-----------------");
        SDAdapterTF sdAdapterTF = new SDAdapterTF(tfCard);
        System.out.println(computer.readSD(sdAdapterTF));
    }
}
