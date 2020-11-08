package com.martini.demo03;

import java.io.Serializable;

/**
 * @author martini at 2020/11/8 09:10
 */
public class Ball implements Serializable, Cloneable {
    private int size;
    private char symbol;

    public Ball() {
    }

    public Ball(int size, char symbol) {
        this.size = size;
        this.symbol = symbol;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "size=" + size +
                ", symbol=" + symbol +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
