package com.martini.demo01;

/**
 * @author martini at 2020/11/10 14:58
 */
public class China extends Place {
    public Object acceptEvaluation(Visitor visitor) {
        System.out.println("中国旅游地收到了一条评价：");
        visitor.giveEvaluation();
        return null;
    }
}
