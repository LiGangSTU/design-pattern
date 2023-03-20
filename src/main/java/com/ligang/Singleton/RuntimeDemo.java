package com.ligang.Singleton;

import java.io.IOException;
import java.io.InputStream;

public class RuntimeDemo {
    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        //返回虚拟机中的内存总量
        System.out.println(runtime.totalMemory());
        //最大内存量
        System.out.println(runtime.maxMemory());

        //创建一个新的进程执行指定字符串命令，返回进程对象
        Process process = runtime.exec("ipconfig");
        // 获取命令执行后的结果，通过输入流获取
        InputStream inputStream = process.getInputStream();
        byte[] bytes = new byte[1024 * 1024 * 100];
        int b = inputStream.read(bytes);
        System.out.println(new String(bytes, 0, b, "gbk"));
    }
}
