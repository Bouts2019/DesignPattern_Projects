package com.martini.type1;

/**
 * @author martini at 2020/11/7 17:45
 */
public class SingletonDemo01 {
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
 * 单例模式（饿汉式 静态变量方式）
 */
class Singleton {
    // 1. 构造器私有化，防止外部new
    private Singleton() {}
    // 2. 本类内部创建对象实例
    private final static Singleton instance = new Singleton();
    // 3. 提供一个公开的静态方法，返回实例对象
    public static Singleton getInstance() {
        return instance;
    }
}