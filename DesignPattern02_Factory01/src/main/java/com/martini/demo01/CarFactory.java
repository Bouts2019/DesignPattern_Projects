package com.martini.demo01;

/**
 * @author martini at 2020/11/7 20:57
 */
public class CarFactory {
    public static Car buildCar(String brand) {
        Car car = null;
        if ("benz".equalsIgnoreCase(brand)) {
            car = new BenzCar();
        } else if ("bmw".equalsIgnoreCase(brand)) {
            car = new BmwCar();
        }
        return car;
    }
}
