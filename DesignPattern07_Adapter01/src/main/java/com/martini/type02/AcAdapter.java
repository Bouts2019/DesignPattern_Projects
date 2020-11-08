package com.martini.type02;

/**
 * @author martini at 2020/11/8 11:19
 */
public class AcAdapter implements Voltage5Adapter {
    private Voltage220Power power;

    public AcAdapter(Voltage220Power power) {
        this.power = power;
    }

    @Override
    public int output5V() {
        int output = 0;
        if (power != null) {
            output = power.output();
            System.out.println(output + " is changing to 5...");
            return 5;
        } else {
            return 0;
        }
    }
}
