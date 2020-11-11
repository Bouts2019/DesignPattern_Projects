package com.martini.demo01;

/**
 * @author martini at 2020/11/11 9:16
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        super(level);
    }

    protected void write(String message) {
        System.out.println("Error Logger: " + message);
    }
}
