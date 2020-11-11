package com.martini.demo01;

/**
 * @author martini at 2020/11/10 14:55
 */
public class American extends Visitor {
    public Object giveEvaluation() {
        System.out.println("American said this place is great.");
        return null;
    }
}
