package com.martini.demo01;

/**
 * @author martini at 2020/11/7 21:36
 */
public class BenzCarFactory extends CarFactory {
    @Override
    public Car buildCar() {
        return new BenzCar();
    }
}
