package com.martini.demo01;

/**
 * @author martini at 2020/11/8 10:08
 */
public class BuilderDemo01 {
    public static void main(String[] args) {
        CarStore carStore = new CarStore();
        carStore.setCarBuilder(new BmwCarBuilder());
        Car car = carStore.getCarBuilder().getCar();
        System.out.println(car);
    }
}
