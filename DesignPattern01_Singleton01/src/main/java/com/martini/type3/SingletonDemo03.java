package com.martini.type3;

/**
 * @author martini at 2020/11/7 18:56
 */
public class SingletonDemo03 {
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
 * 3. 懒汉式（线程不安全）
 */
class Singleton {
    private static Singleton instance;
    private Singleton() {}
    // 提供一个静态方法，当使用到该方法时，才去创建instance
    // 即懒汉式
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
