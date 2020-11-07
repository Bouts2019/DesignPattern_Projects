package com.martini.demo01;

/**
 * @author martini at 2020/11/7 22:12
 */
public class UsaCarFactory implements CarFactory {
    public Car buildCar(String brand) {
        Car car = null;
        if ("bmw".equalsIgnoreCase(brand)) car = new UsaBmwCar();
        else if ("benz".equalsIgnoreCase(brand)) car = new UsaBenzCar();
        return car;
    }
}
