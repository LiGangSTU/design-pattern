package com.ligang.Porxy.JDK_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理工厂，提供了一个创建代理对象的静态方法（newProxyInstance方法）来获取代理对象。代理类是程序在运行过程中动态的在内存中生成的类
 */
public class ProxyFactory {
    private TrainStation trainStation = new TrainStation();
    public SellTickets getProxyObejct(){
        /*
            newProxyInstance()方法参数说明：
            ClassLoader loader ： 类加载器，用于加载代理类，使用真实对象的类加载器即可
            Class<?>[] interfaces ： 真实对象所实现的接口，代理模式真实对象和代理对象实现相同的接口
            InvocationHandler h ： 代理对象的调用处理程序
         */
        //使用Proxy获取代理对象
        SellTickets sellTickets = (SellTickets)Proxy.newProxyInstance(trainStation.getClass().getClassLoader(),
                trainStation.getClass().getInterfaces(),
                new InvocationHandler() {
                    /*
                     InvocationHandler中invoke方法参数说明：
                     proxy ： 代理对象
                     method ： 对应于在代理对象上调用的接口方法的 Method 实例
                     args ： 代理对象调用接口方法时传递的实际参数
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("收费点收取费用，JDK代理");
                        //执行真实对象
                        Object result = method.invoke(trainStation, args);
                        return result;
                    }
                });
        return sellTickets;
    }
}
