package com.ligang.adapter.classAdapter;

public class test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        SDCard sdCard = new SDCardImpl();
        System.out.println(computer.readSD(sdCard));

        System.out.println("-----------------");
        SDAdapterTF sdAdapterTF = new SDAdapterTF();
        System.out.println(computer.readSD(sdAdapterTF));
    }
}
