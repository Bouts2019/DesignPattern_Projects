package com.martini.demo01;

/**
 * @author martini at 2020/11/10 13:00
 */
public class LightOffCommand implements Command {

    private LightReceiver light;

    public LightOffCommand(LightReceiver light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }

    public void undo() {
        light.on();
    }
}
