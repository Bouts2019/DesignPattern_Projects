package com.martini.type8;

import java.util.Calendar;

/**
 * @author martini at 2020/11/7 19:44
 */
public class SingletonDemo08 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}

enum Singleton {
    INSTANCE;
    public void method1() {
        System.out.println("It's singleton.");
    }
}