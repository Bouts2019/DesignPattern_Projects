package com.martini.demo01;

/**
 * Car的建造者，其中聚合了一个Car对象
 * @author martini at 2020/11/8 10:09
 */
public abstract class CarBuilder {
    protected Car car = new Car();
    public abstract void buildBrand();
    public abstract void buildWeight();
    public abstract void buildColor();
    public Car getCar() {
        buildBrand();
        buildWeight();
        buildColor();
        return car;
    }
}
