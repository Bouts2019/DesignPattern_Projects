package com.martini.demo01;

import java.util.HashMap;

/**
 * 抽象运算符解析器，这里每个运算符都只和自己左右两个数字有关系
 * 但左右两个署子有可能是一个解析结果，无论何种类型，都是Expression的实现类
 * @author martini at 2020/11/11 7:25
 */
public class SymbolExpression extends Expression {
    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    // 因为SymbolExpression是让其子类来实现的，因此本身是空实现
    public int interpreter(HashMap<String, Integer> var) {
        return 0;
    }
}
