package com.ligang.Singleton;

/**
 * 饿汉式，类加载导致该对象被创建
 * 该方式在成员位置声明Singleton类型的静态变量，
 * 并创建Singleton类的对象instance。
 * instance对象是随着类的加载而创建的。
 * 如果该对象足够大的话，而一直没有使用就会造成内存的浪费。
 */
public class EHanSingle {
    private EHanSingle(){}

    //在成员位置创建该对象
    private static EHanSingle instance = new EHanSingle();
    //对外静态方法获取
    public static EHanSingle getInstance(){
        return instance;
    }
}
