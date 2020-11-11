package com.martini.demo01;

/**
 * @author martini at 2020/11/10 21:36
 */
public class User {
    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String msg) {
        ChatRoom.acceptMessage(this, msg);
    }

}
