package com.martini.demo01;

/**
 * 容器，是`要打包的物体`的抽象子类
 * @author martini at 2020/11/8 15:46
 */
public abstract class Container extends Stuff {
    @Override
    public int cost() {
        return getPrice();
    }
}
