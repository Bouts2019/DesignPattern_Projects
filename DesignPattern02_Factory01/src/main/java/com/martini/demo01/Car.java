package com.martini.demo01;

/**
 * 抽象类，表示车这一逻辑概念
 * @author martini at 2020/11/7 20:47
 */
public abstract class Car {
    private String brand;

    public void driver() {
        System.out.println(brand + " is driving...");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
