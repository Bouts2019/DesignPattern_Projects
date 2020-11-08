package com.martini.demo01;

/**
 * @author martini at 2020/11/8 17:51
 */
public class AirConditioning {
    private static final AirConditioning instance;
    private AirConditioning() {}
    static {
        instance = new AirConditioning();
    }

    public static AirConditioning getInstance() {
        return instance;
    }
    public void open() {
        System.out.println("AirConditioning opened.");
    }
    public void work() {
        System.out.println("AirConditioning working...");
    }
    public void close() {
        System.out.println("AirConditioning closed.");
    }
}
