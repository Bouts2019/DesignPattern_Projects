package com.martini.demo01;

/**
 * @author martini at 2020/11/8 14:29
 */
public class Sound implements Bluetooth {
    @Override
    public void open() {
        System.out.println("蓝牙音响连接...");
    }

    @Override
    public void work() {
        System.out.println("蓝牙音响工作中...");
    }

    @Override
    public void close() {
        System.out.println("蓝牙音响关闭...");
    }
}
