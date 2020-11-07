package com.martini.demo01;

/**
 * @author martini at 2020/11/7 21:37
 */
public class BmwCarFactory extends CarFactory {
    @Override
    public Car buildCar() {
        return new BmwCar();
    }
}
