package com.martini.demo01;

import java.util.Scanner;

/**
 * @author martini at 2020/11/8 17:52
 */
public class Screen {
    private static Screen instance;
    private Screen() {}
    static {
        instance = new Screen();
    }

    public static Screen getInstance() {
        return instance;
    }
    public void down() {
        System.out.println("Screen down.");
    }
    public void up() {
        System.out.println("Screen up.");
    }
}
