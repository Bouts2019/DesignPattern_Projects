package com.martini.demo01;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author martini at 2020/11/11 7:31
 */
public class Calculator {
    private Expression expression;

    public Calculator(String expression) {
        Stack<Expression> stack = new Stack<Expression>();
        char[] chars = expression.toCharArray();
        Expression left = null;
        Expression right = null;
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '+':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new AddExpression(left, right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default:
                    stack.push(new VarExpression(String.valueOf(chars[i])));
                    break;
            }
        }
        this.expression = stack.pop();
    }

    public int calc(HashMap<String, Integer> var) {
        return this.expression.interpreter(var);
    }
}
