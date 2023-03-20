package com.ligang.Bulider;

public class test {
    public static void main(String[] args) {
        //构建Phone对象
//        Phone phone = new Phone("intel","三星屏幕","金士顿","华硕");
//        System.out.println(phone);
        Phone2 ph = new Phone2.Bulider()
                .cpu("inter")
                .mainboard("博士")
                .memory("买买买")
                .screen("ttty")
                .build();
        System.out.println(ph);
    }
}
