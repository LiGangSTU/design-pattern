package com.ligang.Singleton;

/**
 * 该方式在成员位置声明Singleton类型的静态变量，而对象的创建是在静态代码块中，也是对着类的加载而创建。所以和饿汉式的方式1基本上一样，当然该方式也存在内存浪费问题。
 */
public class EHanSingle2 {
    private EHanSingle2(){}
    private static EHanSingle2 instance;
    //静态代码块
    static {
        instance = new EHanSingle2();
    }
    public static EHanSingle2 getInstance(){
        return instance;
    }
}
