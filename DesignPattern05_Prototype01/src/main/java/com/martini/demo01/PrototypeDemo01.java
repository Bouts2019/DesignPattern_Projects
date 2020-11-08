package com.martini.demo01;

import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * 原型模式 -> clone方法的使用，以及浅拷贝中引用对象类型的变化
 * @author martini at 2020/11/8 07:59
 */
public class PrototypeDemo01 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("Alice", 20, "white");
        Sheep sheep2 = (Sheep)sheep.clone();
        Sheep sheep3 = (Sheep)sheep.clone();
        System.out.println(sheep);
        System.out.println(sheep2);
        System.out.println(sheep3);

        try {
            Field f = String.class.getDeclaredField("value");
            f.setAccessible(true);
            char[] chars = (char[]) f.get(sheep.getName());
            chars[0] = 'B';
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        System.out.println(sheep);
        System.out.println(sheep2);
        System.out.println(sheep3);
    }
}
