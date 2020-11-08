package com.martini.demo01;

/**
 * @author martini at 2020/11/8 14:33
 */
public class VivoPhone extends Phone {
    @Override
    public void openBluetoothDevice() {
        System.out.println("Vivo 手机");
        super.openBluetoothDevice();
    }
}
