package com.martini.demo01;

/**
 * 客户端中的实现
 * 注意视频中的讲解时候还使用了输入字符串的方式
 * 是因为其中除了品牌不同以外，还有其他的分类条件
 * 比如此处如果需要分创建地域的不同，可以是
 *      ChinaBenzCar
 *      ChinaBmwCar
 *      UsaBenzCar
 *      UsaBmwCar
 * 随后要创建的抽象类为
 *      Car(abstract void drive())
 *       |-- ChinaCar
 *         |-- ChinaBenzCar
 *         |-- ChinaBmwCar
 *       |-- UsaCar
 *         |-- UsaBenzCar
 *         |-- UsaBmwCar
 *
 *      CarFactory(abstract Car buildCar(brand: String))
 *       |-- ChinaCarFactory
 *       |-- UsaCarFactory
 * 随后在客户端中创建不同的CarFactory实例即可，每个地域的CarFactory创建不同品牌的带有地域信息的汽车对象
 * @author martini at 2020/11/7 21:25
 */
public class FactoryMethodDemo01 {
    public static void main(String[] args) {
        CarFactory factory = new BenzCarFactory();
        Car car = factory.buildCar();
        car.drive();
    }
}
