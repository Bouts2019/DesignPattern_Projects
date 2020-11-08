package com.martini.demo01;

/**
 * Bridge的概念体现在Phone这个抽象类中，连接了不同的蓝牙设备和不同的品牌手机。
 * 现在要增加一种种类的手机或者要增加一种种类的蓝牙设备都非常轻松，
 * 增加手机不需要将其他蓝牙设备实现一遍，增加蓝牙设备不需要为所有品牌手机适配。
 * @author martini at 2020/11/8 14:26
 */
public class BridgeDemo01 {
    public static void main(String[] args) {
        Phone phone = new MiPhone();
        phone.setDevice(new Earphone());
        phone.openBluetoothDevice();
    }
}
