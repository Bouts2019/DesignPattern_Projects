package com.martini.type5;

/**
 * @author martini at 2020/11/7 19:09
 */
public class SingletonDemo05 {
}

class Singleton {
    private static Singleton instance;
    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }
}
