package com.martini.demo01;

/**
 * @author martini at 2020/11/11 8:43
 */
public class StrategyDemo01 {
    public static void main(String[] args) {
        System.out.println(new Context(new AddOperation()).doOperation(1, 2));
        System.out.println(new Context(new SubOperation()).doOperation(1, 2));
        System.out.println(new Context(new MultiOperation()).doOperation(1, 2));
    }
}
