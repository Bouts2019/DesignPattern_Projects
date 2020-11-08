package com.martini.demo01;

/**
 * @author martini at 2020/11/8 17:54
 */
public class ControlSystem {
    private Projector projector;
    private AirConditioning airConditioning;
    private Screen screen;
    private Light light;

    private static ControlSystem instance;

    private ControlSystem() {
        projector = Projector.getInstance();
        airConditioning = AirConditioning.getInstance();
        screen = Screen.getInstance();
        light = Light.getInstance();
    }

    static {
        instance = new ControlSystem();
    }

    public void ready() {
        projector.open();
        airConditioning.open();
        screen.down();
        light.open();
    }

    public void work() {
        projector.work();
        airConditioning.work();
    }

    public void close() {
        projector.close();
        airConditioning.close();
        screen.up();
        light.close();
    }

    public static ControlSystem getInstance() {
        return instance;
    }
}
