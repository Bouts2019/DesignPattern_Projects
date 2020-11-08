package com.martini.type03;

/**
 * @author martini at 2020/11/8 13:00
 */
public class AdapterDemo03 {
    public static void main(String[] args) {
        // 使用匿名内部类的方式实现
        MouseListener listener = new MouseListenerAdapter() {
            @Override
            public void mouseMove() {
                System.out.println("Mouse Moving...");
            }
        };
        listener.mouseMove();
    }
}
