package com.ligang.Porxy.cglib_proxy;

public class test {
    public static void main(String[] args) {
        //创建代理工厂对象
        ProxyFactory factory = new ProxyFactory();
        //获取代理对象
        TrainStation trainStation = factory.getProxyObject();
        trainStation.sell();
    }
}
