package com.ligang.Porxy.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyFactory implements MethodInterceptor {
    private TrainStation station = new TrainStation();
    public TrainStation getProxyObject(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(station.getClass());
        //调用回调函数
        enhancer.setCallback(this);
        //创建代理对象
        TrainStation obj = (TrainStation) enhancer.create();
        return obj;
    }

    /**
     *
     * @param o ： 代理对象
     *  method ： 真实对象中的方法的Method实例
     *  args ： 实际参数
     *  methodProxy ：代理对象中的方法的method实例
     * @param method
     * @param objects
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("代理点收费：CGLIB");
        TrainStation trainStation = (TrainStation) methodProxy.invokeSuper(o, objects);
        return trainStation;
    }
}
