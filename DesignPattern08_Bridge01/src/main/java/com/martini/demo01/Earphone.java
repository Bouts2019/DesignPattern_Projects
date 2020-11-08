package com.martini.demo01;

/**
 * @author martini at 2020/11/8 14:27
 */
public class Earphone implements Bluetooth {
    @Override
    public void open() {
        System.out.println("蓝牙耳机连接...");
    }

    @Override
    public void work() {
        System.out.println("蓝牙耳机工作中...");
    }

    @Override
    public void close() {
        System.out.println("蓝牙耳机关闭...");
    }
}
