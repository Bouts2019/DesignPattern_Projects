package com.martini.demo01;

/**
 * @author martini at 2020/11/10 14:56
 */
public class Japanese extends Visitor {
    public Object giveEvaluation() {
        System.out.println("日本人は肯定的だ");
        return null;
    }
}
