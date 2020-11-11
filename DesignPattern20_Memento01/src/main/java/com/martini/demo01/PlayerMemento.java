package com.martini.demo01;

/**
 * @author martini at 2020/11/10 21:56
 */
public class PlayerMemento {
    private int hpState;
    private int mpState;

    public PlayerMemento(int hpState, int mpState) {
        this.hpState = hpState;
        this.mpState = mpState;
    }

    public int getHpState() {
        return hpState;
    }

    public int getMpState() {
        return mpState;
    }
}
