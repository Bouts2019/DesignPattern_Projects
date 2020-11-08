package com.martini.type01;

/**
 * @author martini at 2020/11/8 11:19
 */
public class AcAdapter extends Voltage220Power implements Voltage5Adapter {
    @Override
    public int output5V() {
        int output = output();
        System.out.println(output + " is changing to 5...");
        return 5;
    }
}
