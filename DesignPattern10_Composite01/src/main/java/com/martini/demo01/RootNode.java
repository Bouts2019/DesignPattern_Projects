package com.martini.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author martini at 2020/11/8 16:40
 */
public class RootNode extends Node {

    List<Node> nodes = new ArrayList<>();

    public RootNode(String name, String desc) {
        super(name, desc);
    }

    @Override
    protected void print() {
        System.out.println(getName());
        for (Node node : nodes) {
            node.print();
        }
    }

    @Override
    protected void add(Node node) {
        nodes.add(node);
    }

    @Override
    protected void remove(Node node) {
        nodes.remove(node);
    }
}
