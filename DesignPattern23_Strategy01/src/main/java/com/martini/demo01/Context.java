package com.martini.demo01;

/**
 * @author martini at 2020/11/11 8:46
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int doOperation(int a, int b) {
        return strategy.calc(a, b);
    }
}
