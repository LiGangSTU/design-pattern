package com.ligang.principles.demo3.before;

/**
 * @version v1.0
 * @ClassName: HardDisk
 * @Description: 硬盘接口
 * @Author: LG
 */
public interface HardDisk {

    //存储数据
    public void save(String data);

    //获取数据
    public String get();
}
