package com.ligang.Singleton;

/**
 * 懒汉式 线程不安全1
 */
public class BaoHanSingle {
    private BaoHanSingle(){}
    private static BaoHanSingle instance;
    //静态代码块
    public static BaoHanSingle getInstance(){
        if(instance == null)return new BaoHanSingle();
        return instance;
    }

}
