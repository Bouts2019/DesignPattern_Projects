package com.martini.demo01;

import java.util.HashMap;

/**
 * @author martini at 2020/11/11 7:30
 */
public class SubExpression extends SymbolExpression {
    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    // 处理相减的算法
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) - super.right.interpreter(var);
    }
}
