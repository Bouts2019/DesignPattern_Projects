package com.martini.demo01;

/**
 * @author martini at 2020/11/10 13:52
 */
public class TvOnCommand implements Command {
    private TvReceiver tv;

    public TvOnCommand(TvReceiver tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.on();
    }

    public void undo() {
        tv.off();
    }
}
