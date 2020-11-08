package com.martini.demo01;

/**
 * @author martini at 2020/11/8 17:48
 */
public class Light {
    private static final Light instance;
    private Light() {}
    static {
        instance = new Light();
    }

    public static Light getInstance() {
        return instance;
    }
    public void open() {
        System.out.println("Light opened.");
    }
    public void close() {
        System.out.println("Light closed.");
    }
}
