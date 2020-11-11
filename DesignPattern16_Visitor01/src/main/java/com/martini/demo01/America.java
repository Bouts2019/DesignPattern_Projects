package com.martini.demo01;

/**
 * @author martini at 2020/11/10 14:59
 */
public class America extends Place {
    public Object acceptEvaluation(Visitor visitor) {
        System.out.println("The sightseeing place of America got an evaluation: ");
        visitor.giveEvaluation();
        return null;
    }
}
