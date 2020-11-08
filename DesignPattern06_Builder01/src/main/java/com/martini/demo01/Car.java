package com.martini.demo01;

/**
 * 产品
 * @author martini at 2020/11/8 10:08
 */
public class Car {
    private String brand;
    private int weight;
    private String color;

    public Car() {
    }

    public Car(String brand, int weight, String color) {
        this.brand = brand;
        this.weight = weight;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}
