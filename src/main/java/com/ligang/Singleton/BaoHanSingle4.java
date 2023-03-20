package com.ligang.Singleton;

import org.omg.CORBA.MARSHAL;

import java.io.IOException;

/**
 * 懒汉式4 静态内部类
 * 静态内部类单例模式中实例由内部类创建，由于 JVM 在加载外部类的过程中,
 * 是不会加载静态内部类的, 只有内部类的属性/方法被调用时才会被加载,
 * 并初始化其静态属性。静态属性由于被 static 修饰，保证只被实例化一次，并且严格保证实例化顺序。
 */
public class BaoHanSingle4 {
    //私有构造方法
    private BaoHanSingle4() {}

    private static class SingletonHolder {
        private static final BaoHanSingle4 INSTANCE = new BaoHanSingle4();
    }

    //对外提供静态方法获取该对象
    public static BaoHanSingle4 getInstance() {
        return SingletonHolder.INSTANCE;
    }


}
