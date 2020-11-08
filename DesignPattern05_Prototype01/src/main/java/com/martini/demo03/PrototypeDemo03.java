package com.martini.demo03;

/**
 * @author martini at 2020/11/8 09:24
 */
public class PrototypeDemo03 {
    public static void main(String[] args) {
        Box aBox = new Box(1, new Ball(1, 'A'));
        Box bBox = aBox.deepClone();
        Box cBox = aBox.deepClone();
        System.out.println(aBox.hashCode() + ": " + aBox);
        System.out.println(bBox.hashCode() + ": " + bBox);
        System.out.println(cBox.hashCode() + ": " + cBox);

        System.out.println(aBox.getBall().hashCode());
        System.out.println(bBox.getBall().hashCode());
        System.out.println(cBox.getBall().hashCode());

        aBox.getBall().setSize(2);
        System.out.println(aBox.getBall());
        System.out.println(bBox.getBall());
        System.out.println(cBox.getBall());
    }
}
