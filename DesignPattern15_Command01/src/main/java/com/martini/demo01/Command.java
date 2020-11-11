package com.martini.demo01;

/**
 * @author martini at 2020/11/10 12:53
 */
public interface Command {
    void execute();
    void undo();
}
