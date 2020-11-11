package com.martini.demo01;

/**
 * @author martini at 2020/11/10 21:35
 */
public class MediatorDemo01 {
    public static void main(String[] args) {
        User user1 = new User("Alice");
        User user2 = new User("张三");
        user1.sendMessage("hello");
        user2.sendMessage("你好");
    }
}
