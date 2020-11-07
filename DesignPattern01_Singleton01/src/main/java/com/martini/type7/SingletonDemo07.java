package com.martini.type7;

/**
 * @author martini at 2020/11/7 19:36
 */
public class SingletonDemo07 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}

class Singleton {
    private static Singleton instance;
    private Singleton() {}

    // 静态内部类方式完成
    private static class SingletonInstance {
        private final static Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
