package com.martini.demo01;

/**
 * @author martini at 2020/11/7 22:12
 */
public class ChinaCarFactory implements CarFactory {
    public Car buildCar(String brand) {
        Car car = null;
        if ("bmw".equalsIgnoreCase(brand)) car = new ChinaBmwCar();
        else if ("benz".equalsIgnoreCase(brand)) car = new ChinaBenzCar();
        return car;
    }
}
