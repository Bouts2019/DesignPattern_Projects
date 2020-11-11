package com.martini.demo01;

/**
 * @author martini at 2020/11/10 14:55
 */
public class Chinese extends Visitor {
    public Object giveEvaluation() {
        System.out.println("中国人民表示对此地的赞赏。");
        return null;
    }
}
