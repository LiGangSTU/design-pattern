package com.ligang.factory;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

public class CoffeeFactory {
    //加载配置文件，获取配置文件中的配置的全类名
    //定义容器对象存储咖啡
    private static HashMap<String, Coffee> map = new HashMap<String , Coffee>();

    //加载配置文件，只需要加载一次
    static {
        Properties properties = new Properties();
        InputStream inputStream = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            properties.load(inputStream);
            //从p集合中获取类名
            Set<Object> keys = properties.keySet();
            for (Object key:keys){
                String className = properties.getProperty((String) key);
                //反射技术创建对象
                Class clazz = Class.forName(className);
                Coffee coffee = (Coffee) clazz.newInstance();
                map.put((String) key, coffee);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static Coffee createCoffee(String name){
        return map.get(name);
    }
}
