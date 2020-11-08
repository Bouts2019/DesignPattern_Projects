package com.martini.demo01;

/**
 * @author martini at 2020/11/8 17:49
 */
public class Projector {
    private static final Projector instance;
    private Projector() {}
    static {
        instance = new Projector();
    }

    public static Projector getInstance() {
        return instance;
    }
    public void open() {
        System.out.println("Projector opened.");
    }
    public void work() {
        System.out.println("Projector working...");
    }
    public void close() {
        System.out.println("Projector closed.");
    }
}
