package com.martini.demo01;

import java.util.HashMap;

/**
 * 抽象类表达式，通过hashmap的键值对可以获取到各个变量的值
 * 解释公式和数值的关系
 * key -> 表达式中的参数（变量）
 * value -> 表达式中的参数的值（变量的值）
 * 例如 let a = 10
 * 那么key是"a", value = 10
 * @author martini at 2020/11/11 7:22
 */
public abstract class Expression {
    public abstract int interpreter(HashMap<String, Integer> var);
}
