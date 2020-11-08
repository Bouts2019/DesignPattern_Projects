package com.martini.demo01;

/**
 * @author martini at 2020/11/8 10:11
 */
public class BmwCarBuilder extends CarBuilder {
    public void buildBrand() {
        this.car.setBrand("BMW");
    }

    public void buildWeight() {
        this.car.setWeight(100);
    }

    public void buildColor() {
        this.car.setColor("Black");
    }
}
