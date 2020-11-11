package com.martini.demo01;

/**
 * @author martini at 2020/11/11 9:15
 */
public class FileLogger extends AbstractLogger {
    public FileLogger(int level) {
        super(level);
    }

    protected void write(String message) {
        System.out.println("File Logger: " + message);
    }
}
