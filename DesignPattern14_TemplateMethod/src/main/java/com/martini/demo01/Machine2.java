package com.martini.demo01;

/**
 * @author martini at 2020/11/9 08:54
 */
public class Machine2 extends Machine {
    @Override
    protected void run() {
        System.out.println("Machine2 is running...");
    }

    @Override
    protected void turnOn() {
        System.out.println("Machine2 is turn on.");
    }
}
