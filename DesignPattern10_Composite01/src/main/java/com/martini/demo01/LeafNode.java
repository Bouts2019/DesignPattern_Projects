package com.martini.demo01;

/**
 * @author martini at 2020/11/8 16:48
 */
public class LeafNode extends Node {
    public LeafNode(String name, String desc) {
        super(name, desc);
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }
}
