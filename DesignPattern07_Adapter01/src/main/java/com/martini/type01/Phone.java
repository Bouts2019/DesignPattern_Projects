package com.martini.type01;

/**
 * @author martini at 2020/11/8 11:17
 */
public class Phone {
    void charging(Voltage5Adapter adapter) {
        adapter.output5V();
        System.out.println("Phone is charging...");
    }
}
