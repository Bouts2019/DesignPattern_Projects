package com.martini.demo01;

/**
 * @author martini at 2020/11/10 13:53
 */
public class TvOffCommand implements Command {
    private TvReceiver tv;

    public TvOffCommand(TvReceiver tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.off();
    }

    public void undo() {
        tv.on();
    }
}
