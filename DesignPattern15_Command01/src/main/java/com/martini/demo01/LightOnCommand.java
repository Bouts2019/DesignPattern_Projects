package com.martini.demo01;

/**
 * @author martini at 2020/11/10 12:54
 */
public class LightOnCommand implements Command {

    private LightReceiver light;

    public LightOnCommand(LightReceiver light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }

    public void undo() {
        light.off();
    }
}
