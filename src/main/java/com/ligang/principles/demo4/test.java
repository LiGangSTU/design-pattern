package com.ligang.principles.demo4;

public class test {
    public static void main(String[] args) {
        //创建黑马安全门对象
        HeiMaSafetyDoor door = new HeiMaSafetyDoor();
        //调用功能
        door.antiTheft();
        door.fireproof();
        door.waterproof();

        System.out.println("============");
        //创建传智安全门对象
        ItCastSafteyDoor door1 = new ItCastSafteyDoor();
        //调用功能
        door1.antiTheft();
        door1.fireproof();
    }
}
