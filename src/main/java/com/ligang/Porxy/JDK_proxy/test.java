package com.ligang.Porxy.JDK_proxy;

public class test {
    public static void main(String[] args) {
        /**
         * 在测试类中通过代理对象调用sell()方法
         * 根据多态的特性，执行的是代理类（$Proxy0）中的sell()方法
         * 代理类（$Proxy0）中的sell()方法中又调用了InvocationHandler接口的子实现类对象的invoke方法
         * invoke方法通过反射执行了真实对象所属类(TrainStation)中的sell()方法
         */
        ProxyFactory proxyFactory = new ProxyFactory();
        SellTickets sellTickets = proxyFactory.getProxyObejct();
        sellTickets.sell();
    }
}
