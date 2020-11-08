package com.martini.demo01;

/**
 * 泡沫
 * @author martini at 2020/11/8 15:54
 */
public class Foam extends Buffer {
    public Foam(Stuff needToBeBoxed) {
        super(needToBeBoxed);
        setDesc("[泡沫]");
        setPrice(1);
    }
}
