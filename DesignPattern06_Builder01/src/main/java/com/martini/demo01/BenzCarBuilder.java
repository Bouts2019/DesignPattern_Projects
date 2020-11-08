package com.martini.demo01;

/**
 * @author martini at 2020/11/8 10:13
 */
public class BenzCarBuilder extends CarBuilder {
    public void buildBrand() {
        this.car.setBrand("BENZ");
    }

    public void buildWeight() {
        this.car.setWeight(200);
    }

    public void buildColor() {
        this.car.setColor("White");
    }
}
