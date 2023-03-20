package com.ligang.factory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Collection接口是抽象工厂类，
 * ArrayList是具体的工厂类；
 * Iterator接口是抽象商品类，
 * ArrayList类中的Iter内部类是具体的商品类。
 * 在具体的工厂类中iterator()方法创建具体的商品类的对象。
 */
public class JDK_demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("令狐冲");
        list.add("风清扬");
        list.add("任我行");

        // 获取迭代器对象
        Iterator<String> iterator = list.iterator();
        //迭代器遍历
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
