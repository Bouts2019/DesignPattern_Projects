package com.martini.demo01;

import java.util.HashMap;

/**
 * 变量的解析器
 * @author martini at 2020/11/11 7:24
 */
public class VarExpression extends Expression {
    // 变量名
    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    // 根据变量名称返回变量的值
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
