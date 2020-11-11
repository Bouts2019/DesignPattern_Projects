package com.martini.demo01;

/**
 * @author martini at 2020/11/11 8:33
 */
public class StopState implements State {
    public void doAction(Context context) {
        System.out.println("Now is stop state.");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "StopState{}";
    }
}
