package com.martini.demo01;

/**
 * 要打包的物品
 * @author martini at 2020/11/8 15:45
 */
public abstract class Stuff {
    private String desc;
    private int price;

    public abstract int cost();

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
