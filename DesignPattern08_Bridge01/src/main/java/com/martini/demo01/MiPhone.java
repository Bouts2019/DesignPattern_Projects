package com.martini.demo01;

/**
 * @author martini at 2020/11/8 14:32
 */
public class MiPhone extends Phone {
    @Override
    public void openBluetoothDevice() {
        System.out.println("小米手机：");
        super.openBluetoothDevice();
    }
}
