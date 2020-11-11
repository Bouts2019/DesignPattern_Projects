package com.martini.demo01;

import java.util.HashMap;

/**
 * @author martini at 2020/11/11 7:28
 */
public class AddExpression extends SymbolExpression {
    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    // 处理相加的算法
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
