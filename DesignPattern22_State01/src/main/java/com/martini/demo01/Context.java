package com.martini.demo01;

/**
 * @author martini at 2020/11/11 8:31
 */
public class Context {
    private State state;

    public Context() {
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
