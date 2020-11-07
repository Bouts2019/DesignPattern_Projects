package com.martini.demo01;

/**
 * @author martini at 2020/11/7 20:47
 */
public class FactoryDemo01 {
    public static void main(String[] args) {
        // 本main方法相当于一个客户端
        // 客户端中根据要求创建对应的车的实例
        // 本来需要编写如下代码
//        String brand = scan.next();
//        if ("benz".equals(brand)) {
//            // ...
//        } else if ("bmw".equals(brand)) {
//            // ...
//        } else {
//            // ...
//        }
        // 以上代码关键问题在于创建的逻辑过多，并且依赖于太多的类
        // 使用工厂模式解耦，关键是把创建逻辑从客户端中抽离
        Car car = CarFactory.buildCar("bmw");
        car.driver();
    }
}
