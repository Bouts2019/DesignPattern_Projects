package com.martini.demo01;

/**
 * @author martini at 2020/11/8 14:30
 */
public abstract class Phone {
    private Bluetooth device;

    public Bluetooth getDevice() {
        return device;
    }

    public void setDevice(Bluetooth device) {
        this.device = device;
    }

    public void openBluetoothDevice() {
        if (device != null) {
            device.open();
        } else {
            System.out.println("No bluetooth found.");
        }
    }
}
