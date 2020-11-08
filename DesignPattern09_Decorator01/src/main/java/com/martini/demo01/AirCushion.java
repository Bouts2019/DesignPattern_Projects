package com.martini.demo01;

/**
 * 气垫
 * @author martini at 2020/11/8 15:56
 */
public class AirCushion extends Buffer {
    public AirCushion(Stuff needToBeBoxed) {
        super(needToBeBoxed);
        setDesc("[气垫]");
        setPrice(2);
    }
}
