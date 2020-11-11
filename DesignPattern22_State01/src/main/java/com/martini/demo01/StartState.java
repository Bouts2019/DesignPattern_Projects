package com.martini.demo01;

/**
 * @author martini at 2020/11/11 8:32
 */
public class StartState implements State {
    public void doAction(Context context) {
        System.out.println("Now is start state.");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "StartState{}";
    }
}
