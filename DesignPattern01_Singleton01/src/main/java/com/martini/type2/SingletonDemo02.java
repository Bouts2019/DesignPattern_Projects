package com.martini.type2;

/**
 * @author martini at 2020/11/7 18:48
 */
public class SingletonDemo02 {
    public static void main(String[] args) {
        // 测试
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
    }
}

/**
 * 2. 饿汉式（静态代码块）
 */
class Singleton {
    private Singleton() {}
    // 没有final
    private static Singleton instance;
    static {
        instance = new Singleton();
    }
    public static Singleton getInstance() {
        return instance;
    }
}
