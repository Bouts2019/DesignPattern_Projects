package com.martini.demo01;

/**
 * @author martini at 2020/11/7 22:07
 */
public class AbstractFactoryDemo01 {
    public static void main(String[] args) {
        CarFactory factory = new ChinaCarFactory();
        Car car = factory.buildCar("bmw");
        car.drive();
    }
}
