package com.martini.demo01;

/**
 * 缓冲物，即装饰者
 * @author martini at 2020/11/8 15:49
 */
public abstract class Buffer extends Stuff {
    private final Stuff needToBeBoxed;

    public Buffer(Stuff needToBeBoxed) {
        this.needToBeBoxed = needToBeBoxed;
    }

    @Override
    public int cost() {
        return getPrice() + needToBeBoxed.cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + needToBeBoxed.getDesc();
    }
}
