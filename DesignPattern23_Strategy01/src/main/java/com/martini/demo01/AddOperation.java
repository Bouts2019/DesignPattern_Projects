package com.martini.demo01;

/**
 * @author martini at 2020/11/11 8:45
 */
public class AddOperation implements Strategy {
    public int calc(int a, int b) {
        return a + b;
    }
}
