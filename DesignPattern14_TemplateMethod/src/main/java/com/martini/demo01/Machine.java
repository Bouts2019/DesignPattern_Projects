package com.martini.demo01;

/**
 * @author martini at 2020/11/9 08:50
 */
public abstract class Machine {
    // 不允许子类重新定义工作流程
    public final void work() {
        turnOn();
        run();
        turnOff();
    }

    protected void turnOn() {
        System.out.println("This machine is turn on.");
    }

    protected void turnOff() {
        System.out.println("This machine is turn off.");
    }

    protected abstract void run();

}
