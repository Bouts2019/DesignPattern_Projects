package com.martini.demo01;

import java.util.Date;

/**
 * @author martini at 2020/11/10 21:35
 */
public class ChatRoom {
    public static void acceptMessage(User user, String msg) {
        System.out.println(new Date() + " " + user.getName() + " said: " + msg);
    }
}
