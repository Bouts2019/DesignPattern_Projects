package com.martini.demo01;

/**
 * @author martini at 2020/11/11 9:13
 */
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level) {
        super(level);
    }

    protected void write(String message) {
        System.out.println("Console Logger: " + message);
    }
}
