package com.martini.type4;

/**
 * @author martini at 2020/11/7 19:04
 */
public class SingletonDemo04 {
}

class Singleton {
    private static Singleton instance;
    private Singleton() {}
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
