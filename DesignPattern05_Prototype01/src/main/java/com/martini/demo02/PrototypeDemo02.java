package com.martini.demo02;

/**
 * 深拷贝方式一
 * @author martini at 2020/11/8 09:09
 */
public class PrototypeDemo02 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Box aBox = new Box(1, new Ball(1, 'A'));
        Box bBox = (Box)aBox.clone();
        Box cBox = (Box)aBox.clone();
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
