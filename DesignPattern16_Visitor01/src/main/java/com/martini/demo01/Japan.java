package com.martini.demo01;

/**
 * @author martini at 2020/11/10 15:01
 */
public class Japan extends Place {
    public Object acceptEvaluation(Visitor visitor) {
        System.out.println("日本の観光地が評価された：");
        visitor.giveEvaluation();
        return null;
    }
}
