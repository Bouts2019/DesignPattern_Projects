package com.martini.demo01;

/**
 * 后续client中使用的时候，需要有一个Command数组，用于填充，取消对null的判断
 * @author martini at 2020/11/10 13:01
 */
public class NoCommand implements Command {
    public void execute() {

    }

    public void undo() {

    }
}
