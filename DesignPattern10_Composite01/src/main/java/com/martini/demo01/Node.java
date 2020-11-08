package com.martini.demo01;

/**
 * 根结点、中间节点、叶子结点的共同抽象父类
 * @author martini at 2020/11/8 16:36
 */
public abstract class Node {
    private String name;
    private String desc;

    protected void add(Node node) {
        // 空实现，因为叶子结点不需要add方法
        throw new UnsupportedOperationException();
    }

    protected void remove(Node node) {
        throw new UnsupportedOperationException();
    }

    public Node(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    protected abstract void print();

    public Node() {
    }
}
