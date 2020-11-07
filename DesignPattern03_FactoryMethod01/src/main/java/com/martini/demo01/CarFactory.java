package com.martini.demo01;

/**
 * 此处汽车工厂是抽象类，因为其中包含抽象方法buildCar
 * @author martini at 2020/11/7 21:36
 */
public abstract class CarFactory {
    public abstract Car buildCar();
}
