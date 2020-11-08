package com.martini.demo01;

/**
 * @author martini at 2020/11/8 14:34
 */
public class SamsungPhone extends Phone {
    @Override
    public void openBluetoothDevice() {
        System.out.println("三星手机：");
        super.openBluetoothDevice();
    }
}
